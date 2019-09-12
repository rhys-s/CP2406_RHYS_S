public class Car extends Vehicle {
    private int carSpeed = 2;
    public Car(double initialX, double initialY,String direction,int currentRoad) {
        super(initialX, initialY,direction,currentRoad);
        setSpeed(carSpeed);
        setLength(getCarLength());
        setWidth(getLength()*0.5);
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
}