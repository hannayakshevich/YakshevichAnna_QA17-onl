package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private boolean isOn;
    private boolean cpu;
    private boolean ram;
    private boolean hdd;
    private int lifeCyclesCount;

    public Computer() {
    }

    public Computer(boolean cpu, boolean ram, boolean hdd, int lifeCyclesCount){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.lifeCyclesCount = lifeCyclesCount;
    }

    public void computerDescription(){
        StringBuilder sb = new StringBuilder();
        if (cpu){
            sb.append("[\"есть\", ");
        }
        else {
            sb.append("[\"нет\", ");
        }
        if (ram){
            sb.append("\"есть\", ");
        }
        else {
            sb.append("\"нет\", ");
        }
        if (hdd){
            sb.append("\"есть\", ");
        }
        else {
            sb.append("\"нет\", ");
        }
        sb.append(lifeCyclesCount + "циклов]");
        System.out.println(sb);
    }

    public boolean switchOn(){
        if (isOn){
            System.out.println("Computer has been already switched on");
            return false;
        }
        if (lifeCyclesCount == 0){
            System.out.println("Computer is dead");
            return false;
        }

        if (!hasRam() || !hasCpu() || !hasHdd()){
            System.out.println("check your computer components");
            return false;
        }

        if (randomVsUser()){
            isOn = true;
            System.out.println("Lucky you. Computer will work for a while.");
            return true;
        }

        return true;
    }

    public boolean switchOff(){
        if (!isOn){
            System.out.println("Computer is not on");
            return false;
        }
        if (randomVsUser()){
            isOn = false;
            lifeCyclesCount--;
            System.out.println("Computer has been switched off");
            return true;
        }

        return true;
    }

    public boolean hasRam(){
        if (!ram){
            System.out.println("ram is missing");
            return false;
        }
        return true;
    }

    public boolean hasCpu(){
        if (!cpu){
            System.out.println("cpu is missing");
            return false;
        }
        return true;
    }

    public boolean hasHdd(){
        if (!hdd){
            System.out.println("hdd is missing");
            return false;
        }
        return true;
    }

    public boolean randomVsUser(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        if (random.nextInt(2) != scanner.nextInt()){
            lifeCyclesCount = 0;
            System.out.println("KABOOM!!!");
            System.out.println("Computer is dead");
            return false;
        }

        return true;
    }

    public boolean isCpu() {
        return cpu;
    }

    public void setCpu(boolean cpu) {
        this.cpu = cpu;
    }

    public boolean isRam() {
        return ram;
    }

    public void setRam(boolean ram) {
        this.ram = ram;
    }

    public boolean isHdd() {
        return hdd;
    }

    public void setHdd(boolean hdd) {
        this.hdd = hdd;
    }

    public int getLifeCyclesCount() {
        return lifeCyclesCount;
    }

    public void setLifeCyclesCount(int lifeCyclesCount) {
        this.lifeCyclesCount = lifeCyclesCount;
    }
}
