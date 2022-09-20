package Lesson12.Entity;

import java.util.Random;
import java.util.Scanner;

public class Mentor {

    private Scanner scanner = new Scanner(System.in);

    private String name;
    private long id;

    public Mentor() {
        System.out.println("Введите имя Препода");
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

    @Override
    public String toString() {
        return name;
    }
}
