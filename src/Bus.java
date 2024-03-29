public class Bus extends Vehicle {
    private int busSpeed = 1;
    public Bus(double initialX, double initialY,String direction,int currentRoad) {
        super(initialX, initialY,direction,currentRoad);
        setSpeed(busSpeed);// Sets default speed for motorbike
        setLength(getCarLength()*3); // Bus 3 times as long as car
        setWidth(getLength()*0.5); // Bus width half of length
    }

    public void setBusSpeed(int busSpeed) {
        this.busSpeed = busSpeed;
    }
}
