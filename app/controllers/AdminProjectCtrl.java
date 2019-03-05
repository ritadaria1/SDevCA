package controllers;

import controllers.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.Logger;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;


// Import models and views
import models.users.*;
import models.projects.*;

import views.html.projectAdmin.*;


/* - Docs -
http://superuser.com/questions/163818/how-to-install-rmagick-on-ubuntu-10-04
http://im4java.sourceforge.net/
*/

// Authenticate user
@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)

public class AdminProjectCtrl extends Controller {

    /** Dependency Injection **/

    /**
     * http://stackoverflow.com/questions/15600186/play-framework-dependency-injection
     **/
    private FormFactory formFactory;

    /**
     * http://stackoverflow.com/a/37024198
     **/
    private Environment env;

    /**
     * http://stackoverflow.com/a/10159220/6322856
     **/
    @Inject
    public AdminProjectCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    // Get a user - if logged in email will be set in the session
    private User getCurrentUser() {
        User u = User.getLoggedIn(session().get("email"));
        return u;
    }

    public Result index() {
        return redirect(controllers.routes.AdminProjectCtrl.listProjects(0));
    }

    // Get a list of projects
    // If cat parameter is 0 then return all projects
    // Otherwise return projects for a category (by id)
    @Transactional
    public Result listProjects(Long cat) {
        // Get list of categories in ascending order
        List<Category> categories = Category.find.query().where().orderBy("name asc").findList();
        // Instantiate projects, an Array list of projects			
        List<Project> projects = new ArrayList<Project>();

        if (cat == 0) {
            // Get the list of ALL projects with filter
            projects = Project.findAll("");
        } else {
            // Get projects for the selected category and filter (search field)
            projects = Project.findFilter(cat, "");
        }
        // Render the list projects view, passing parameters
        // categories and projects lists
        // current user - if one is logged in
        return ok(listProjects.render(env, categories, projects, getCurrentUser()));
    }

    // Load the add project view
    // Display an empty form in the view
    @Transactional
    public Result addProject() {
        // Instantiate a form object based on the Project class
        Form<Project> addProjectForm = formFactory.form(Project.class);
        // Render the Add Project View, passing the form object
        return ok(addProject.render(addProjectForm, getCurrentUser()));
    }

    // Handle the form data when a new project is submitted
    @Transactional
    public Result addProjectSubmit() {



        // Create a project form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        // Check for errors (based on Project class annotations)	
        if (newProjectForm.hasErrors()) {
            // Display the form again
            return badRequest(addProject.render(newProjectForm, getCurrentUser()));
        }

        Project newProject = newProjectForm.get();

        // Save project now to set id (needed to update manytomany)
        newProject.save();

        // Get category ids (checked boxes from form)
        // Find category objects and set categories list for this project
        for (Long cat : newProject.getCatSelect()) {
            newProject.getCategories().add(Category.find.byId(cat));
        }

        // Update the new Project to save categories
        newProject.update();

        // Get image data
        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        // Save the image file
       String saveImageMsg = saveFile(newProject.getId(), image); ///NEEDS FIXING

        // Set a success message in temporary flash
        flash("success", "Project " + newProject.getName() + " has been created" + " " + saveImageMsg);

        // Redirect to the admin home
        return redirect(controllers.routes.AdminProjectCtrl.index());
    }

    // Update a project by ID
    // called when edit button is pressed
    @Transactional
    public Result updateProject(Long id) {
        // Retrieve the project by id
        // Create a form based on the Project class
        Project p = Project.find.byId(id);
        Form<Project> projectForm = formFactory.form(Project.class).fill(p);
        // Render the updateProject view
        // pass the id and form as parameters
        return ok(updateProject.render(id, projectForm, User.getLoggedIn(session().get("email"))));
    }


    // Handle the form data when an updated project is submitted
    @Transactional
    public Result updateProjectSubmit(Long id) {

        String saveImageMsg;

        // Create a project form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Project> updateProjectForm = formFactory.form(Project.class).bindFromRequest();

        // Check for errors (based on Project class annotations)	
        if (updateProjectForm.hasErrors()) {
            // Display the form again
            return badRequest(updateProject.render(id, updateProjectForm, getCurrentUser()));
        }

        // Update the Project (using its ID to select the existing object))
        Project p = updateProjectForm.get();
        p.setId(id);

        // Get category ids (checked boxes from form)
        // Find category objects and set categories list for this project
        List<Category> newCats = new ArrayList<Category>();
        for (Long cat : p.getCatSelect()) {
            newCats.add(Category.find.byId(cat));
        }
        p.setCategories(newCats);

        // update (save) this project            
        p.update();

        // Get image data
        Http.MultipartFormData body = request().body().asMultipartFormData();
       Http.MultipartFormData.FilePart file = body.getFile("file");

    //    saveImageMsg = saveFile(p.getId(), file);   //////////////////////NEEDS FIX LATER

        // Add a success message to the flash session
       // flash("success", "Project " + updateProjectForm.get().getName() + " has been updates" + " " + saveImageMsg);

        // Return to admin home
        return redirect(controllers.routes.AdminProjectCtrl.index());
    }


    // Delete Project
    @Transactional
    public Result deleteProject(Long id) {
        // Call delete method
        Project.find.ref(id).delete();
        // Add message to flash session 
        flash("success", "Project has been deleted");
        // Redirect home
        return redirect(routes.AdminProjectCtrl.index());
    }

    // Save an image file


    public String saveFile(Long id, FilePart<File> uploaded) {
        // Make sure that the file exists.
        if (uploaded != null) {
            // Make sure that the content is actually an image.
            String mimeType = uploaded.getContentType();
            if (mimeType.startsWith("image/")) {
                // Get the file name.
                String fileName = uploaded.getFilename();
                // Extract the extension from the file name.
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i + 1);
                }
                // Now we save the file (not that if the file is saved without
                // a path specified, it is saved to a default location,
                // usually the temp or tmp directory).
                // 1) Create a file object from the uploaded file part.
                File file = uploaded.getFile();
                // 2) Make sure that our destination directory exists and if
                //    not create it.
                File dir = new File("public/images/projectImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                // 3) Actually save the file.
                File newFile = new File("public/images/projectImages/", id + "." + extension);
                if (file.renameTo(newFile)) {
                    try {
                        BufferedImage img = ImageIO.read(newFile);
                        BufferedImage scaledImg = Scalr.resize(img, 90);

                        if (ImageIO.write(scaledImg, extension, new File("public/images/projectImages/thumbnails", id + ".jpg"))) {
                            return "/ file uploaded and thumbnail created.";
                        } else {
                            return "/ file uploaded but thumbnail creation failed.";
                        }
                    } catch (IOException e) {
                        return "/ file uploaded but thumbnail creation failed.";
                    }
                } else {
                    return "/ file upload failed.";
                }

            }
        }
        return "/ no image file.";
    }
}