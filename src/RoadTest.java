import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    Road road = new Road(60,30,0,"Horizontal",1,2);
    @Test
    void testDefaultConstructor() {
        //Test default constructor components
        assertEquals(road.getRoadLength(),60);
        assertEquals(road.getInitialX1(),30);
        assertEquals(road.getInitialY1(),0);
        assertEquals(road.getOrientation(),"Horizontal");
        assertEquals(road.getIdentifier(),1);
        assertEquals(road.getTouchingRoads(),2);
    }
    @Test
    void testRoadEnd() {
        road.checkRoadEnd();
        assertEquals(road.getFinishX1(),90);
    }
    @Test
    void testVehicleList(){
        //Add vehicle to road and add to vehicle arraylist
        road.addCar();
        //Test that the vehicle is on current road
        assertEquals(road.vehicles.get(0).getCurrentRoad(),1);
        //Test that vehicle initialX1 = road initialX
        assertEquals(road.vehicles.get(0).getInitialX(),30);
    }
    @Test
    void testTrafficlightList(){
        //Add trafficlight to road and add to trafficlight arraylist
        road.addTrafficLight();
        //Test default traffic light colour from array list
        assertEquals(road.trafficLights.get(0).getLightColour(),"green");
        //Test trafficlight x position from arraylist
        assertEquals(road.trafficLights.get(0).getX(),90);

    }
    @Test
    void testInitiateFrontPoint(){
        //Add vehicle onto road then initiate frontpoint
        road.addCar();
        road.initiateVehiclesFrontPoint();
        //Test currentX from vehicle 0 in vehicle list
        assertEquals(road.vehicles.get(0).getCurrentX(),36);
    }
}