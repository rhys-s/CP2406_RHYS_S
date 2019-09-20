import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car1 = new Car(0,1,"East",1);
    Bus bus1 = new Bus(60,2,"East",2);
    Motorbike motorbike1 = new Motorbike(120,3,"East",3);
    @Test
    void testDefaultConstructor(){
        // Test Direction
        assertEquals(car1.getDirection(),"East");
        assertEquals(bus1.getDirection(),"East");
        assertEquals(motorbike1.getDirection(),"East");
        //Test Current Road
        assertEquals(car1.getCurrentRoad(),1);
        assertEquals(bus1.getCurrentRoad(),2);
        assertEquals(motorbike1.getCurrentRoad(),3);
        // Test InitialX
        assertEquals(car1.getInitialX(),0);
        assertEquals(bus1.getInitialX(),60);
        assertEquals(motorbike1.getInitialX(),120);
        //TestInitialY
        assertEquals(car1.getInitialY(),1);
        assertEquals(bus1.getInitialY(),2);
        assertEquals(motorbike1.getInitialY(),3);
    }
    @Test
    void testInitiateFrontOfVehicle() {
        //Use initatiate direction function
        car1.initiateFrontOfVehicle();
        bus1.initiateFrontOfVehicle();
        motorbike1.initiateFrontOfVehicle();
        //Test currentX after initatiate direction
        assertEquals(car1.getCurrentX(),6);
        assertEquals(bus1.getCurrentX(),78);
        assertEquals(motorbike1.getCurrentX(),123);

    }
    @Test
    void testDrive(){
        //Initiate direction
        car1.initiateFrontOfVehicle();
        bus1.initiateFrontOfVehicle();
        motorbike1.initiateFrontOfVehicle();
        //Test speeds
        assertEquals(car1.getSpeed(),2);
        assertEquals(bus1.getSpeed(),1);
        assertEquals(motorbike1.getSpeed(),3);
        //Use drive function
        car1.drive();
        bus1.drive();
        motorbike1.drive();
        //Test currentX after drive
        assertEquals(car1.getCurrentX(),8);
        assertEquals(bus1.getCurrentX(),79);
        assertEquals(motorbike1.getCurrentX(),126);

    }
}