import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.Random;

import static org.junit.jupiter.api.Assertions.*;


class TestTrafficLight {

    @Test
    void checkLight() {

        TrafficLight light = new TrafficLight();
        // boolean check = (light.trafficController() == 0 || light.trafficController() == 1);
//        assertTrue(check);
        //light.setTrafficState();
        light.setState();
        boolean check = (light.getState() == 0 || light.getState() == 1);
        System.out.println(light.getState());
        System.out.println(light.getTrafficState());


    }

}