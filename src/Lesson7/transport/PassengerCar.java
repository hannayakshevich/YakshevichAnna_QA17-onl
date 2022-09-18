package Lesson7.transport;
import java.util.Scanner;

public class PassengerCar extends Ground{
    private String bodyType;
    private int numberPassengers;
    public Scanner scanner = new Scanner(System.in);

    public PassengerCar(int countHorsePower, double weight, double maxSpeed, String brand,
                        int wheelsNumber, double fuelConsumption, String bodyType, int numberPassengers){
        super(countHorsePower, weight, maxSpeed, brand, wheelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    @Override
    public void description () {
       System.out.println("Легкавая: " + getCountHorsePower() + ", " + getWeight() + ", " + getMaxSpeed() + ", "
                       + getBrand() + ", " +  getWheelsNumber() + ", " + getFuelConsumption() + ", " + bodyType +
               ", " + numberPassengers + ", " + power());
    }

    public double countKm() {
        System.out.print("Введите время: ");
        double time = scanner.nextInt();
        double kilometrage = getMaxSpeed() * time;
        double literFuel = litersFuel(kilometrage);
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью "
               + getMaxSpeed() + " км/ч проедет " + kilometrage + " км и израсходует " + literFuel + " литров топлива.");
        return kilometrage;
    }

    private double litersFuel(double kilometrage){
        return (getFuelConsumption() * kilometrage)/100;
    }

    @Override
    public double power(){
        return (getCountHorsePower() * getONE_HORSE_POWER());
    }

    public String getBodyType() {return bodyType;}

    public void setBodyType(String bodyType) {this.bodyType = bodyType;}

    public int getNumberPassengers() {return numberPassengers;}

    public void setNumberPassengers(int numberPassengers) {this.numberPassengers = numberPassengers;}
}
