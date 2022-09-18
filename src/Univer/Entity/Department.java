package Univer.Entity;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Department {

    private Scanner scanner = new Scanner(System.in);

    private String name;
    private long id;
    private ArrayList<Mentor> mentors = new ArrayList<>();

    public Department() {
        System.out.println("Введите название факультета");
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

    public ArrayList<Mentor> getMentors() {
        return mentors;
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public Mentor getMentor(long id){
        for (int i = 0; i < mentors.size(); i++) {
            if (mentors.get(i).getId() == id) {
                return mentors.get(i);
            }
        }
        return null;
    }

    public void removeMentorById(long id){
        for (int i = 0; i < mentors.size(); i++){
            if (mentors.get(i).getId() == id){
                mentors.remove(mentors.get(i));
                break;
            }
        }
    }

    public void removeMentorByName(String name){
        for (int i = 0; i < mentors.size(); i++){
            if (mentors.get(i).getName().equals(name)){
                mentors.remove(mentors.get(i));
                break;
            }
        }
    }

    public ArrayList<Mentor> getAllMentors(){
        return mentors;
    }

    @Override
    public String toString() {
        return "Department" +
                "name='" + name + '\'' +
                ", mentors=" + mentors;
    }
}
