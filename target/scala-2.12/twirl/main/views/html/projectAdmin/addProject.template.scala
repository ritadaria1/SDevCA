
package views.html.projectAdmin

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.projects.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProjectForm: Form[models.projects.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import models.projects._
/*8.2*/import helper._


Seq[Any](format.raw/*2.1*/("""<!-- addProjectForm defined above is the parameter
 passed to this view by the controller -->
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/projectAdmin/*11.14*/.main("New Project", user)/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""

	"""),format.raw/*13.2*/("""<h3>Add a new Project</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminProjectCtrl.addProjectSubmit(), 'class -> "form-horizontal", 'role->"form", 'method -> "POST", 'enctype -> "multipart/form-data")/*16.158*/ {_display_(Seq[Any](format.raw/*16.160*/("""
		"""),_display_(/*17.4*/CSRF/*17.8*/.formField),format.raw/*17.18*/("""
		"""),format.raw/*18.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*20.4*/inputText(addProjectForm("name"), '_label -> "Employee Name",'class -> "form-control")),format.raw/*20.90*/("""
		"""),_display_(/*21.4*/inputText(addProjectForm("currentproject"), '_label -> "Project Description",'class -> "form-control")),format.raw/*21.106*/("""

        """),format.raw/*23.9*/("""<!-- Checkboxes for categories - current categories for this Project are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*25.10*/for((value, name) <- Category.options) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
            """),format.raw/*26.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*26.63*/value),format.raw/*26.68*/("""" />"""),_display_(/*26.73*/name),format.raw/*26.77*/("""<br>        
        """)))}),format.raw/*27.10*/("""
"""),format.raw/*28.1*/("""<p>Please tick the box above and then type the the selected department above below</p>
		"""),_display_(/*29.4*/inputText(addProjectForm("department"), '_label -> "Department",'class -> "form-control")),format.raw/*29.93*/("""
		"""),format.raw/*30.3*/(""")

		<!-- Image upload input -->
		<label>Image of Employee</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Project" class="btn btn-primary">
			<a href=""""),_display_(/*41.14*/routes/*41.20*/.AdminProjectCtrl.listProjects(0)),format.raw/*41.53*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*45.3*/(""" """),format.raw/*45.4*/("""<!-- End Form definition -->

""")))}),format.raw/*47.2*/(""" """),format.raw/*47.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(addProjectForm:Form[models.projects.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProjectForm,user)

  def f:((Form[models.projects.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProjectForm,user) => apply(addProjectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 05 16:49:25 GMT 2019
                  SOURCE: /home/wdd/CA1sdev/SDevCA/app/views/projectAdmin/addProject.scala.html
                  HASH: b16b52334729d1808ef3ab6443dbc8942c852710
                  MATRIX: 1007->1|1152->169|1184->304|1228->74|1348->194|1375->195|1509->320|1537->321|1617->375|1638->387|1673->413|1713->415|1743->418|1864->513|2029->668|2070->670|2100->674|2112->678|2143->688|2173->691|2294->786|2401->872|2431->876|2555->978|2592->988|2787->1156|2841->1194|2881->1196|2922->1209|2999->1259|3025->1264|3057->1269|3082->1273|3135->1295|3163->1296|3279->1386|3389->1475|3419->1478|3732->1764|3747->1770|3801->1803|3904->1876|3932->1877|3993->1908|4021->1909
                  LINES: 28->1|31->4|32->8|35->2|37->5|38->6|40->9|41->10|42->11|42->11|42->11|42->11|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|51->20|51->20|52->21|52->21|54->23|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|59->28|60->29|60->29|61->30|72->41|72->41|72->41|76->45|76->45|78->47|78->47
                  -- GENERATED --
              */
          