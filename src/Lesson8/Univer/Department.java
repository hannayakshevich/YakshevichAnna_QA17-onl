package Lesson8.Univer;

import javax.lang.model.element.Name;

abstract class Department {
    private String nameDepartment;

    public Department (String nameDepartment){
        this.nameDepartment = nameDepartment;
    }

    abstract void addInstructor();

    abstract void removeInstructor();

    abstract void getInstructor();

    abstract void getAllInstructor();

    public String getNameDepartment() {return nameDepartment;}

    public void setNameDepartment(String nameDepartment) {this.nameDepartment = nameDepartment;}
}
