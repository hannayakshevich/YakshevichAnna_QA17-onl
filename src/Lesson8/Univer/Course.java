package Lesson8.Univer;

import javax.naming.Name;

public class Course extends Department{
    private String courseName;
    private int courseID;

    public Course(String nameDepartment, String courseName, int courseID) {
        super(nameDepartment);
        this.courseName = courseName;
        this.courseID = courseID;
    }

    @Override
    void addInstructor() {

    }

    @Override
    void removeInstructor() {

    }

    @Override
    void getInstructor() {

    }

    @Override
    void getAllInstructor() {

    }

    public String getCourseName() {return courseName;}

    public void setCourseName(String courseName) {this.courseName = courseName;}

    public int getCourseID() {return courseID;}

    public void setCourseID(int courseID) {this.courseID = courseID;}
}
