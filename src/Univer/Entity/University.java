package Univer.Entity;

import Univer.Exceptions.DepartmentNotFoundException;
import Univer.Exceptions.MentorNotFoundException;
import Univer.Exceptions.StudentNotFoundException;

import java.util.ArrayList;

public class University {

    private String name;
    private String address;
    private String number;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Department> departmentList = new ArrayList<>();

    public University(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Student> getAllStudents(){
        return studentList;
    }

    public void addStudent(Student student, String departmentName){
        try{
            for (Department department : departmentList){
                if (department.getName().equals(departmentName)){
                    student.setDepartment(department);
                    studentList.add(student);
                }
            }
            if (student.getDepartment() == null){
                throw new DepartmentNotFoundException();
            }
        }
        catch (DepartmentNotFoundException dnfe){
            System.out.println(dnfe.getMessage());
        }
    }

    public void removeStudent(String name){
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getName().equals(name)){
                studentList.remove(studentList.get(i));
                break;
            }
        }
    }

    public Student getStudent(long id){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return studentList.get(i);
            }
        }
        return null;
    }

    public Student getStudentByNameAndHisMentorName(String studentName, String mentorName) throws StudentNotFoundException {
        Department department = null;
        ArrayList<Student> lookingForStudentList = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getName().equals(studentName)) {
                lookingForStudentList.add(student);
            }
        }

        if (lookingForStudentList.isEmpty()) {
            throw new StudentNotFoundException();
        }

        try{
        for (Department value : departmentList) {
            department = value;
            boolean finedMentor = false;
            ArrayList<Mentor> mentorList = department.getMentors();
            for (Mentor mentor1 : mentorList) {
                if (mentor1.getName().equals(mentorName)) {
                    department = value;
                    finedMentor = true;
                    break;
                };
            }
            if (finedMentor == true){
                break;
            }
        } if(department.getMentors().contains(mentorName) == false){
                department = null;
                throw new MentorNotFoundException(mentorName);
            }
        }catch (MentorNotFoundException mnfe) {
                System.out.println(mnfe.getMessage());
        }

        try {
            for (Student student : lookingForStudentList) {
                if (student.getDepartment().equals(department) &&
                        student.getName().equals(studentName)) {
                    return student;
                } else throw new StudentNotFoundException();
            }
        }
        catch (StudentNotFoundException snfe){
            System.out.println(snfe.getMessage());
        }
        return null;
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public Department getDepartment(long id){
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getId() == id) {
                return departmentList.get(i);
            }
        }
        return null;
    }

    public ArrayList<Department> getAllDepartments(){
        return departmentList;
    }
}
