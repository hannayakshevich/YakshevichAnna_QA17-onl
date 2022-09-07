package Lesson7.transport;

abstract class Transport {
    private int countHorsePower;
    private double maxSpeed;
    private double weight;
    private String brand;
    private double ONE_HORSE_POWER = 0.74;

    public Transport (int countHorsePower, double weight, double maxSpeed, String brand){
        this.countHorsePower = countHorsePower;
        this.weight = weight;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    abstract void description();

    abstract double power();

    public int getCountHorsePower() {return countHorsePower;}

    public void setCountHorsePower(int countHorsePower) {this.countHorsePower = countHorsePower;}

    public double getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(double maxSpeed) {this.maxSpeed = maxSpeed;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public double getONE_HORSE_POWER() {return ONE_HORSE_POWER;}

    public void setONE_HORSE_POWER(double ONE_HORSE_POWER) {this.ONE_HORSE_POWER = ONE_HORSE_POWER;}
}
