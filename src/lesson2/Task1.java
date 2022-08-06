package lesson2;

/**
 * В спортивном центре есть три возрастные группы для занятий волейболом:
 * 1 группа - от 7 до 13 лет;
 * 2 группа - от 14 до 17 лет;
 * 3 группа - от 18 до 65 лет.
 * Напишите метод, который принимает возраст человека и возвращает целое число,
 * которое обозначает номер группы в которую его надо определить,
 * если подходящей группы нет - верните ‘-1’.
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Возраст:");
        int age = in.nextInt();
        if (age >= 7 && age <= 13){
            System.out.println("1 группа");
        }
        else if (age >= 14 && age <= 17){
                System.out.println("2 группа");
            }
            else if (age >= 18 && age <= 65){
            System.out.println("3 группа");
            }
            else {
            System.out.println("-1");
        }
    }
}