package Lesson7.transport;

abstract class Air extends Transport{
    double wingspan;
    double minLengthLandStrip;

    public Air(int countHorsePower, double weight, double maxSpeed, String brand,
               double wingspan, double minLengthLandStrip) {
        super(countHorsePower, weight, maxSpeed, brand);
        this.wingspan = wingspan;
        this.minLengthLandStrip = minLengthLandStrip;
    }

    public double getWingspan() {return wingspan;}

    public void setWingspan(double wingspan) {this.wingspan = wingspan;}

    public double getMinLengthLandStrip() {return minLengthLandStrip;}

    public void setMinLengthLandStrip(double minLengthLandStrip) {this.minLengthLandStrip = minLengthLandStrip;}
}
