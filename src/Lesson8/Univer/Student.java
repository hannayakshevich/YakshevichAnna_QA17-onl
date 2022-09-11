package Lesson8.Univer;

import javax.naming.Name;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);

    private String studentName;
    private int studentID;
    int countInstructors;
    Name massiveInstructors[] = new Name[countInstructors];

    public Student(){

    }

    public String getStudentName() {return studentName;}

    public void setStudentName(String studentName) {this.studentName = studentName;}

    public int getStudentID() {return studentID;}

    public void setStudentID(int studentID) {this.studentID = studentID;}
}
