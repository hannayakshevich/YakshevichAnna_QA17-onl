package Univer;

import Univer.Entity.Department;
import Univer.Entity.Mentor;
import Univer.Entity.Student;
import Univer.Entity.University;
import Univer.Exceptions.StudentNotFoundException;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws StudentNotFoundException {

        University UNI = new University("UNI", "Address", "+123456789"); //создаём универ


        for (int i = 0; i < 2; i++) {
            Department department = new Department();
            UNI.addDepartment(department);//создаём факультеты
        }

        System.out.println(UNI.getAllDepartments());

        for (int i = 0; i < 3; i++) {
            Mentor mentor = new Mentor();
            System.out.println("Введите факультет, на котором будет преподавать препод");
            String departmentName = scanner.next();
            for (Department department: UNI.getAllDepartments()) {
                if (department.getName().equals(departmentName)){
                    department.getMentors().add(mentor);
                }
            }
        }

        for (Department department : UNI.getAllDepartments()){
            System.out.println(department.getMentors());
        }

        System.out.println(UNI.getAllDepartments());

        for (int i = 0; i < 4; i++) {
            Student student = new Student();
            System.out.println("Введите факультет зачисления");  //зачисляем новых студентов на конкретные факультеты
            UNI.addStudent(student, scanner.next());
        }

        System.out.println(UNI.getAllStudents());

        System.out.println("Введите имя студента, которого ищем");
        String studentNameToFind = scanner.next();
        System.out.println("Введите имя препода, который преподаёт у этого студента");
        String mentorName = scanner.next();

        System.out.println(UNI.getStudentByNameAndHisMentorName(studentNameToFind, mentorName));
    }
}