package Lesson8.Univer;

import javax.naming.Name;
import java.util.Scanner;

public class Instructor {
    private String instructorName;
    Scanner scanner = new Scanner(System.in);

    public Instructor(){

    }

    public void addStudentNameSurname(){
       System.out.print("Введи колличество студентов: ");
       int countStudents = scanner.nextInt();
       String arrayStudents[] = new String [countStudents];

       for(int i = 0; i < countStudents; i++){
           System.out.print("Введи Имя и Фамилию студента: ");
           arrayStudents[i] = scanner.nextLine();
       }

       for (int i = 0; i < countStudents; i++){
           System.out.println(arrayStudents[i]);
      }
    }

    public String getInstructorName() {return instructorName;}

    public void setInstructorName(String instructorName) {this.instructorName = instructorName;}
}
