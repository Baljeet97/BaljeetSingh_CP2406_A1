import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTrafficLight {

    @Test
    void checkLight() {

        TrafficLight light = new TrafficLight();
        light.setState();
        boolean check = (light.getState() == 0 || light.getState() == 1);
        assertTrue(check);


    }

}