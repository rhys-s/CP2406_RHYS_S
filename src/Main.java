import java.util.ArrayList;


public class Main {
    public ArrayList<Road> roads = new ArrayList<Road>();


    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.addRoad(50, 0, 0, "Horizontal", 0, 1);
        main.addRoad(50, 50, 0, "Horizontal", 1, 99); // 99 stands for no touching roads and an exit
        main.roads.get(0).addCar();       // Creates car on Road 0
        main.roads.get(0).addTrafficLight(); //Creates traffic light on end of Road 0

        for (int b = 0; b < main.roads.size(); b++) {
            Road r = main.roads.get(b);   //Gets road object from arraylist
            System.out.println(r.getIdentifier());
            for (int a = 0; a < r.vehicles.size(); a++) {
                Vehicle v = r.vehicles.get(b);
                v.initiateFrontOfVehicle(); //Puts marker at front of specific vehicle depending on direction
            }
        }
        for (; ; ) {
            Thread.sleep(500);
            for (int b = 0; b < main.roads.size(); b++) {
                Road r = main.roads.get(b); //Gets road object from arraylist
                r.driveVehicles();
                if (b!= r.getIdentifier()){
                    r =main.roads.get(r.getTouchingRoads());
                    r.driveVehicles();
                    else if (v.getCurrentX()getFinishX1()){
                        v.drive();
                        System.out.println(v.getCurrentX());
                }

            }
        }
    }


    public void addRoad(double roadLength, double initialX1, double initialY1, String orientation, int identifier, int touchingRoads) {
        roads.add(new Road(roadLength, initialX1, initialY1, orientation, identifier, touchingRoads));
    }

}

