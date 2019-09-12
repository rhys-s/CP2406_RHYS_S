import java.util.Random;
public class TrafficLight {

    public double randomValue, x, y;
    String lightColour;
    private double rateOfChange = 0.3;

    public TrafficLight(double x, double y) {
        lightColour = "green";
        this.x = x;
        this.y = y;
    }

    public void operates() {
        Random random = new Random();
        randomValue = random.nextDouble();
        if (randomValue <= 0.8) {
            lightColour = "red";
        } else {
            lightColour = "green";
        }
    }

    public String getLightColour() {
        return lightColour;
    }

    public void setLightColour(String lightColour) {
        this.lightColour = lightColour;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}