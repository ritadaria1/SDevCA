package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model{
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String email;

    @Constraints.Required
    private String password;

    public Employee() {
    }

    public Employee(Long id, String name, String em) {
        this.id = id;
        this.name = name;
        this.email = em;
    }


    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
    
    public static final List<Employee> findAll() {
        return Employee.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        this.password = p;
    }
}