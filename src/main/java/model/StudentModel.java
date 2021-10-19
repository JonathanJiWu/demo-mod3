package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//I want this obj to be a table in the database
@Entity

//creating a blank table that named student
@Table(name = "student")
public class StudentModel {

//    to show it's primary Key
    @Id

//    these gotta be columns
    private int id;
    private String name;
    private String grade;

    public StudentModel(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
