package Univer.Entity;

import java.util.Random;

public class Course {

    private String name;
    private long id;

    public Course(String name) {
        this.name = name;
        this.id = Math.abs(new Random().nextLong());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}