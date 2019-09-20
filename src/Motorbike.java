public class Motorbike extends Vehicle {
    private int motorbikeSpeed= 3;
    public Motorbike(double initialX, double initialY,String direction,int currentRoad) {
        super(initialX, initialY,direction,currentRoad);
        setSpeed(motorbikeSpeed); // Sets default speed for motorbike
        setLength(getCarLength() * 0.5); // Moto half length of car
        setWidth(getLength() * 0.5); // Moto width half of length
    }

    public void setMotorbikeSpeed(int motorbikeSpeed) {
        this.motorbikeSpeed = motorbikeSpeed;
    }
}
