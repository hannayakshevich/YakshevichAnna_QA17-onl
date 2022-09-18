package Lesson7.transport;
import java.util.Scanner;

public class CivilPlane extends Air{
    private int countPassengers;
    private boolean availabilityBusinessClass;
    Scanner scanner = new Scanner(System.in);

    public CivilPlane(int countHorsePower, double weight, double maxSpeed, String brand, double wingspan,
                      double minLengthLandStrip, int countPassengers, boolean availabilityBusinessClass){
        super(countHorsePower, weight, maxSpeed, brand, wingspan, minLengthLandStrip);
        this.countPassengers = countPassengers;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    @Override
    public void description() {
        System.out.println("Пассажирский самолет: " + getCountHorsePower() + ", " + getWeight() + ", " + getMaxSpeed() + ", "
                + getBrand() + ", " +  getWingspan() + ", " + getMinLengthLandStrip() + ", " +
                countPassengers + ", " + availabilityBusinessClass + ", " + power());
    }

    public void isFreePlace(){
        System.out.print("Введите коллечество пассажинов в самолете: ");
        int countPassengersPlane = scanner.nextInt();
        if(countPassengersPlane < getCountPassengers()){
            System.out.println("Есть свободные места в самолете");
        } else {
            System.out.println("Нет свободных мест в самолете");
        }
    }

    @Override
    public double power() {
        return (getCountHorsePower() * getONE_HORSE_POWER());
    }

    public int getCountPassengers() {return countPassengers;}

    public void setCountPassengers(int countPassengers) {this.countPassengers = countPassengers;}
}
