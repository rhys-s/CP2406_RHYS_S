import java.util.ArrayList;


public class Road {
    private final int roadWidth = 40;
    private double carLength = 6;
    private int identifier;
    private double roadLength;
    private double initialX1, initialY1, finishX1, finishY1;
    private String orientation;
    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<TrafficLight>();
    private int touchingRoads;
    boolean collision;


    public Road(double roadLength, double initialX1, double initialY1, String orientation, int identifier, int touchingRoads) {
        this.roadLength = roadLength;
        this.initialX1 = initialX1;
        this.initialY1 = initialY1;
        this.orientation = orientation;
        this.identifier = identifier;
        this.touchingRoads = touchingRoads;
    }

    public void checkRoadEnd() {
        if (orientation.equals("Horizontal")) {
            setFinishX1(initialX1 + roadLength);
        } else if (orientation.equals("Vertical")) {
            setFinishX1(initialX1 + roadLength);
        }
    }

    public boolean collisionDetection() {
        collision = false;
        for (int c = 0; c < vehicles.size(); c++) {
            Vehicle v = vehicles.get(c);
            for (int d = 1; d < vehicles.size(); d++) {
                Vehicle a = vehicles.get(d);
                System.out.println(a.getSpeed());
                System.out.println(v.getSpeed());
                if (c != d) {
                    if (v.getCurrentX() + v.getSpeed() <= a.getCurrentX() + a.getSpeed() &&
                            v.getCurrentX() + v.getSpeed() - v.getLength()
                                    >= a.getCurrentX() + a.getSpeed() - a.getLength()) {
                        collision = true;

                    }

                }


            }
        }
        return collision;
    }



    public void addCar() {
        vehicles.add(new Car(getInitialX1(), getInitialY1(), "East", getIdentifier()));
    }

    public void addBus() {
        vehicles.add(new Bus(50, getInitialY1(), "East", getIdentifier()));
    }
    public void addTrafficLight() {
        trafficLights.add(new TrafficLight((getRoadLength() + initialX1), getFinishY1()));
    }

    public int getTouchingRoads() {
        return touchingRoads;
    }


    public void setTouchingRoads(int touchingRoads) {

    }

    public String getOrientation() {
        return orientation;
    }

    public double getInitialX1() {
        return initialX1;
    }

    public double getFinishX1() {
        return finishX1;
    }

    public void setFinishX1(double finishX1) {
        this.finishX1 = finishX1;
    }

    public double getFinishY1() {
        return finishY1;
    }

    public void setFinishY1(double finishY1) {
        this.finishY1 = finishY1;
    }

    public double getInitialY1() {
        return initialY1;
    }

    public double getRoadLength() {
        return roadLength;
    }

    public int getRoadWidth() {
        return roadWidth;
    }


    public int getIdentifier() {
        return identifier;
    }
}
