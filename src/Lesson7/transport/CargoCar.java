package Lesson7.transport;
import java.util.Scanner;

public class CargoCar extends Ground{
    double loadCapacity;
    Scanner scanner = new Scanner(System.in);

    public CargoCar(int countHorsePower, double weight, double maxSpeed, String brand,
                    int wheelsNumber, double fuelConsumption, double loadCapacity){
        super(countHorsePower, weight, maxSpeed, brand, wheelsNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void description() {
        System.out.println("Грузовая: " + getCountHorsePower() + ", " + getWeight() + ", " + getMaxSpeed() + ", "
                + getBrand() + ", " +  getWheelsNumber() + ", " + getFuelConsumption() + ", " + loadCapacity + ", " + power());
    }

    public void isLoaded(){
        System.out.print("Введите колличество тонн груза: ");
        int countLoaded = scanner.nextInt();
        if (countLoaded <= getLoadCapacity()){
            System.out.println("Грузовик загружен");
        }
        else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public double power(){
        return (getCountHorsePower() * getONE_HORSE_POWER());
    }

    public double getLoadCapacity() {return loadCapacity;}

    public void setLoadCapacity(double loadCapacity) {this.loadCapacity = loadCapacity;}
}
