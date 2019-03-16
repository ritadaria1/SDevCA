package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Projects extends Model {
    
        // Properties
        @Id
        private Long id;

        @Constraints.Required
        private String name;

        @ManyToOne
        private Department department;

        @Constraints.Required
        private String description; 

        @Constraints.Required
        private String startDate; 
        

        public static final Finder<Long, Projects> find = new Finder<>(Projects.class);
    

        public static final List<Projects> findAll() { 
            return Projects.find.all();
        }
        // Default Constructor
        public Projects() {
        }
    
        // Constructor to initialise object
        public Projects(Long id, String name, String description, String startDate) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.startDate = startDate;
        }
    
        // Accessor methods
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Department getDepartment() {
            return department;
        }
        public void setDepartment(Department department) {
            this.department = department;
        }

        public String getDescription() { 
            return description; 
        } 
        public void setDescription(String description) { 
            this.description = description; 
        } 

        public String getStartDate() { 
            return startDate; 
        } 
        public void setStartDate(String startDate) { 
            this.startDate = startDate; 
        } 
         
    }
    