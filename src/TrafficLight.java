import java.util.Random;

public class TrafficLight {
    /*Traffic lights will change color between 0=red and 1=green*/

    private Random rand = new Random();
    private int state = 0; // setting lights to red
    private int trafficState;
    String lightStatus;


    int getState() {
        return state;
    }

    void setState() {
        this.setTrafficState();
        if (trafficState == 0) {
            state = 0; //red
            lightStatus = "Light is Red";
        } else {
            state = 1; //green
            lightStatus = "Light is Green";
        }
    }

    private void setTrafficState() {
        this.trafficState = rand.nextInt(2); //setting light state by using random
    }
}



