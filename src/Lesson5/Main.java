package Lesson5;

public class Main {

    public static void main(String[] args) {
        Computer dell = new Computer(true,true,true,20);
        Computer lenovo = new Computer(true,false,true,0);
        Computer mac = new Computer();

        mac.setRam(true);
        mac.setCpu(true);
        mac.setHdd(true);
        mac.setLifeCyclesCount(5);
        dell.computerDescription();
        lenovo.computerDescription();
        dell.switchOn();
        lenovo.switchOn();
        if (lenovo.isRam()){
            lenovo.switchOn();
        } else {
            lenovo.setRam(true);
            lenovo.switchOn();
        }
        lenovo.computerDescription();
        dell.switchOff();
        dell.computerDescription();
        lenovo.switchOff();
        lenovo.computerDescription();
    }
}
