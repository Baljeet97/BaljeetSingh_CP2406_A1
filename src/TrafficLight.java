import java.util.Random;

public class TrafficLight {
    private Random rand = new Random();
    private int state = 0; // red
    private int trafficState;
    String lightStatus;


    int getState() {
        return state;
    }

    void setState() {
        this.setTrafficState();
        if (trafficState == 0) {
            state = 0;
            lightStatus = "Light is Red";
        } else {
            state = 1;
            lightStatus = "Light is Green";
        }
    }

    private void setTrafficState() {
        this.trafficState = rand.nextInt(2);
    }
}



