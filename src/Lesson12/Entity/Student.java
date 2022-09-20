package Lesson12.Entity;

import java.util.Random;
import java.util.Scanner;

public class Student {

    private Scanner scanner = new Scanner(System.in);

    private String name;
    private long id;
    private Department department;

    public Student() {
        System.out.println("Введите имя и фамилию студента");
        this.name = scanner.next();
        this.id = Math.abs(new Random().nextLong());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student:" +
                "name='" + name + '\'' +
                ", department=" + department;
    }
}
