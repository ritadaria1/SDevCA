package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model {
    @Id
    private Long id;
    
    @Constraints.Required
    private String name;

    @OneToMany
    private List<Projects> projects;

    public Department() {
    }

    public Department(Long id, String name, List<Projects> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public static Finder<Long, Department> find = new Finder<Long, Department>(Department.class);

    public static List<Department> findAll() {
        return Department.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Department d: Department.findAll()) {
            options.put(d.getId().toString(), d.getName());
        }
        
        return options;
    }

}