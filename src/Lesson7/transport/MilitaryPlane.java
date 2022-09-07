package Lesson7.transport;
import java.util.Random;

public class MilitaryPlane extends Air{
    private boolean availabilityEjectionSystem;
    private int numberMissiles;
    public Random random = new Random();


    public MilitaryPlane(int countHorsePower, double weight, double maxSpeed, String brand, double wingspan,
                         double minLengthLandStrip, boolean availabilityEjectionSystem, int numberMissiles) {
        super(countHorsePower, weight, maxSpeed, brand, wingspan, minLengthLandStrip);
        this.availabilityEjectionSystem = availabilityEjectionSystem;
        this.numberMissiles = numberMissiles;
    }

    @Override
    public void description() {
        System.out.println("Военный самолет: " + getCountHorsePower() + ", " + getWeight() + ", " + getMaxSpeed() + ", "
                + getBrand() + ", " +  getWingspan() + ", " + getMinLengthLandStrip() + ", " +
                availabilityEjectionSystem + ", " + numberMissiles + ", " + power());
    }

    public void shot(){
        int availabilityMissiles = random.nextInt(2);
        if (availabilityMissiles == 0){
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println("Ракета пошла...");
        }
    }

    public void ejection(){
        if(isAvailabilityEjectionSystem()){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
    @Override
    public double power(){
        return (getCountHorsePower() * getONE_HORSE_POWER());
    }

    public boolean isAvailabilityEjectionSystem() {return availabilityEjectionSystem;}

    public void setAvailabilityEjectionSystem(boolean availabilityEjectionSystem) {
        this.availabilityEjectionSystem = availabilityEjectionSystem;
    }

    public int getNumberMissiles() {return  numberMissiles;}

    public void setNumberMissiles(int numberMissiles) {this.numberMissiles = numberMissiles;}
}
