package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    boolean isOn;
    boolean processor;
    boolean ram;
    boolean hardDrive;
    int countCycles;
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public Computer(boolean processor, boolean ram, boolean hardDrive, int countCycles){
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.countCycles = countCycles;
    }

    @Override
    public String toString() {
        return "[\"" + processor + "\", \"" + ram + "\", \"" + hardDrive + "\", " + countCycles + " циклов]";
    }
    public boolean switchingOn() {
        for (int i = this.countCycles; i >= 0; i--){
            int num1 = random.nextInt(2);
            System.out.print("Рандомное значение: " + num1 + ". Значение с клавиатуры: ");
            int num2 = scanner.nextInt();
            if (num1 == num2 && this.countCycles != 0){
                this.isOn = true;
                break;
            } else this.isOn = false;
            this.countCycles--;
        }

        return (isOn);
    }
    public boolean switchingOff() {
            for (int i = this.countCycles; i >= 0; i--){
                int num1 = random.nextInt(2);
                System.out.print("Рандомное значение: " + num1 + ". Значение с клавиатуры: ");
                int num2 = scanner.nextInt();
                if (num1 == num2 && this.countCycles != 0){
                    this.isOn = true;
                    break;
                } else this.isOn = false;
                this.countCycles--;
            }
            return (isOn);
        }
}

