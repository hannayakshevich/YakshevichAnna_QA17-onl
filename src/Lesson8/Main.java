package Lesson8;

import Lesson8.Univer.Course;
import Lesson8.Univer.Instructor;
import Lesson8.Univer.University;

public class Main {
    public static void main(String[] args) {
        University bsuir = new University("БГУИР", "г.Минск, ул. Петруся Бровки, д. 10",
                123456);
        Course fre = new Course("Радиотехники и электроники", "Радиотехника", 01);
        Course fie = new Course("Инженерно-экономический", "Электронный маркетинг", 02);
        Course fkp = new Course("Компьютерного проектирования", "Электоронные системы" +
                "безопасности", 03);

        Instructor students = new Instructor();

        System.out.println(bsuir.toString());
        students.addStudentNameSurname();
    }
}
