package Lesson7.transport;

abstract class Ground extends Transport{
    private int wheelsNumber;
    private double fuelConsumption;

    public Ground(int countHorsePower, double weight, double maxSpeed, String brand,
                  int wheelsNumber, double fuelConsumption) {
        super(countHorsePower, weight, maxSpeed, brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelsNumber() {return wheelsNumber;}

    public void setWheelsNumber(int wheelsNumber) {this.wheelsNumber = wheelsNumber;}

    public double getFuelConsumption() {return fuelConsumption;}

    public void setFuelConsumption(double fuelConsumption) {this.fuelConsumption = fuelConsumption;}

}
