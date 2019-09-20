public class Car extends Vehicle {
    private int carSpeed = 2;
    public Car(double initialX, double initialY,String direction,int currentRoad) {
        super(initialX, initialY,direction,currentRoad);
        setSpeed(carSpeed);// Sets default speed for car
        setLength(getCarLength()); //setting length in parent class
        setWidth(getLength()*0.5); // car width = half of length
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
}