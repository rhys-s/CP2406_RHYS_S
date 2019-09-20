import java.awt.*;
import java.util.ArrayList;


public class Main {
    private static Road nextRoad;
    public ArrayList<Road> roads = new ArrayList<Road>();
    private static boolean simulateRoads = true;


    {
        //Creates intitialiser block so the arraylist for a road can be accessed and edited
        //Since only one main object created will only run through once
        //Road objects created
        Road road1 = new Road(60, 0, 0, "Horizontal", 1, 2);
        Road road2 = new Road(60, 60, 0, "Horizontal", 2, 0);
        //Road objects added to roads arraylist
        roads.add(road1); //
        roads.add(road2);
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main(); // Creates main object
        main.roads.get(0).addCar(); // Creates car on Road 0
        main.roads.get(0).addTrafficLight(); //Creates traffic light on end of Road 0
        main.roads.get(1).addBus(); // Adds bus at start of road 2

        for (int d = 0; d < main.roads.size(); d++) {
            Road r = main.roads.get(d);   //Gets road object from arraylist
            r.initiateVehiclesFrontPoint(); //Front of vehicle intialised
            r.checkRoadEnd(); // Road end is initialised so finishX1 can be determined
        }
        while (simulateRoads) { // Main function for driving car
            //Need to add function that checks size of roads vehicles lists size and if all =0 set simulateRoads to false
            Thread.sleep(250); //Delay of 250ms between every run through
            for (int b = 0; b < main.roads.size(); b++) { // Goes through each road in roads arraylist
                Road currentRoad = main.roads.get(b); //Gets road object from arraylist
                for (int c = 0; c < currentRoad.vehicles.size(); c++) {
                    // Goes through every vehicle in vehicle arrayList on specific road
                    Vehicle currentVehicle = currentRoad.vehicles.get(c);
                    if (currentRoad.getTouchingRoads() == 0) { // 0 represents a road that exits the simulation parameters
                        if (currentVehicle.getCurrentX() < currentRoad.getFinishX1()) {
                            currentVehicle.drive();
                            System.out.println(currentVehicle.getCurrentX());
                        } else {
                            currentRoad.vehicles.remove(currentVehicle);// Removes vehicle from arrayList at end of Road
                        }
                    } else {
                        // trafficLight object obtained here so the roads that dont contain exit can be accessed
                        TrafficLight t = currentRoad.trafficLights.get(0);
                        t.operates(); //Function switches traffic light between green and red
                        if (currentVehicle.getCurrentX() < currentRoad.getFinishX1()) {
                            currentVehicle.drive();
                            System.out.println(currentVehicle.getCurrentX());
                        } else if (currentVehicle.getCurrentX() == currentRoad.getFinishX1() && t.lightColour.equals("green")) {
                            //If at traffic light and traffic light = green drive car
                            nextRoad = main.roads.get(currentRoad.getTouchingRoads() - 1);
                            //Set all details of currentRoad to next Touching road
                            currentRoad.setFinishX1(nextRoad.getFinishX1()); // Sets ending pos to next road ending pos
                            currentRoad.setTouchingRoads(nextRoad.getTouchingRoads());
                            currentRoad.setIdentifier(nextRoad.getIdentifier());
                            System.out.println("Vehicle has changed onto road " + currentRoad.getIdentifier());
                        }
                    }
                }
            }
        }
    }
}

