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

    //Operate function gets random double between 0.00 and 1 , if less than rateOfChange change the light colour
    public void operates() {
        Random random = new Random();
        randomValue = random.nextDouble();
        if (randomValue <= rateOfChange) {
            lightColour = "red";
        } else {
            lightColour = "green";
        }
    }
    //Following functions are getters and setters for the previously listed variables
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

    public void setRateOfChange(double rateOfChange) {
        this.rateOfChange = rateOfChange;
    }
}