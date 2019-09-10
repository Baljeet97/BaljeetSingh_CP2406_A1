import java.util.Random;

public class TrafficLight {
    private Random rand = new Random();
    private int state = 0; // red
    private int trafficState;


    public int getState() {
        return state;
    }

    public void setState() {
        this.setTrafficState();
        if (trafficState == 0) {
            state = 0;
        } else {
            state = 1;
        }
    }

    public int getTrafficState() {
        return trafficState;
    }

    public void setTrafficState() {
        this.trafficState = rand.nextInt(2);
    }
}



