import java.util.ArrayList;


public class Main {

    Road road1 = new Road(50, 0, 0, "Horizontal", 0, 1);
    Road road2 = new Road(50, 50, 0, "Horizontal", 1, 2);




    public static void main(String[] args) throws InterruptedException {

        for (int b = 0; b < roads.size(); b++) {


            for (int b = 0; b < road1.vehicles.size(); b++) {
                Vehicle v = road1.vehicles.get(b);
                v.initiateFrontOfVehicle();
            }
            // while (road1.collisionDetection() == false) {
            for (int b = 0; b < road1.vehicles.size(); b++) {
                Vehicle v = road1.vehicles.get(b);
                TrafficLight t = road1.trafficLights.get(b);
                Thread.sleep(1000);
                t.operates();
                System.out.println(t.getLightColour());

                if (t.lightColour.equals("green")) {
                    v.drive();
                } else if (t.lightColour.equals("red")) {
                    while (v.getCurrentX() < t.getX() - 1) {
                        v.drive();
                        break;

                    }
                } else if (v.getCurrentX() >= t.getX()) {
                    road2.addCar();
                    v = null;

                }
                System.out.println(v.getCurrentX());
                System.out.println(t.getX());
            }
            //Initialise Vehichles roads and traffic lights on road
        }
    }

    public void setRoads(ArrayList<Road> roads) {
        this.roads = roads;
    }

}

