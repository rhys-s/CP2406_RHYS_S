import java.util.ArrayList;


public class Road {
    private final int roadWidth = 40;
    private double carLength = 6;
    private int identifier; //current road object id
    private double roadLength;
    private double initialX1, initialY1, finishX1, finishY1;
    private String orientation;
    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    public ArrayList<TrafficLight> trafficLights = new ArrayList<TrafficLight>();
    private int touchingRoads;
    boolean collision;

    //Default constructor
    public Road(double roadLength, double initialX1, double initialY1, String orientation, int identifier, int touchingRoads) {
        this.roadLength = roadLength;
        this.initialX1 = initialX1;
        this.initialY1 = initialY1;
        this.orientation = orientation;
        this.identifier = identifier;
        this.touchingRoads = touchingRoads;
    }
    //Changes finish X1 or finishY1 depending on orientation of road
    public void checkRoadEnd() {
        if (orientation.equals("Horizontal")) {
            setFinishX1(initialX1 + roadLength);
        } else if (orientation.equals("Vertical")) {
            setFinishX1(initialX1 + roadLength);
        }
    }
    //Goes through vehicles list and initialises the front of the vehicle
    public void initiateVehiclesFrontPoint() {
        for (int a = 0; a < vehicles.size(); a++) {
            Vehicle v = vehicles.get(a);
            v.initiateFrontOfVehicle(); //Puts marker at front of specific vehicle depending on direction
        }
    }

/* // Edited out code that checked for collision
    public boolean collisionDetection() {

        collision = false;
        /*
        for (int c = 0; c < vehicles.size(); c++) {
            Vehicle v = vehicles.get(c);
            for (int d = 0; d < vehicles.size(); d++) {
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
*/
    // // // // // // //Following functions add trafficlight and vehicles onto road // // // // // // // // // // // //
    public void addCar() {
        vehicles.add(new Car(getInitialX1(), getInitialY1(), "East", getIdentifier()));
    }

    public void addBus() {
        vehicles.add(new Bus(getInitialX1(), getInitialY1(), "East", getIdentifier()));
    }

    public void addMotorbike() {
        vehicles.add(new Motorbike(getInitialX1(), getInitialY1(), "East", getIdentifier()));
    }

    public void addTrafficLight() {
        trafficLights.add(new TrafficLight((getRoadLength() + initialX1), getFinishY1()));
    }
    // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //



    // // // // // // Following functions are getters and setters for previously mentioned variables// // // // // // //
    public int getTouchingRoads() {
        return touchingRoads;
    }

    public void setInitialX1(double initialX1) { this.initialX1 = initialX1; }

    public void setInitialY1(double initialY1) { this.initialY1 = initialY1; }

    public void setTouchingRoads(int touchingRoads) { this.touchingRoads = touchingRoads; }

    public String getOrientation() {
        return orientation;
    }

    public double getInitialX1() {
        return initialX1;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
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
    // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
}
