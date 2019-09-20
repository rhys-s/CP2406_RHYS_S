import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    TrafficLight t = new TrafficLight(10,0);
    @Test
    void testDefaultConstructor() {
        //Test default constructor
        assertEquals(t.getLightColour(),"green");
        assertEquals(t.getX(),10);
        assertEquals(t.getY(),0);
    }
    @Test
    void testTrafficLightOperation() {
        //Change rate of change to 1 so light has to change to red
        t.setRateOfChange(1);
        t.operates();
        //Check light colour after operating
        assertEquals(t.getLightColour(),"red");
    }



}