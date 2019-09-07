import java.util.Random;

public class TrafficLight {

    public TrafficLight(boolean isGreen, boolean isRed) {

    }

    /*Adding Randomness to traffic lights */
    static int trafficController() {
        Random rand = new Random();
        int lightStatus = rand.nextInt(2);//0 = red, 1= green

        if (lightStatus == 0) {
            System.out.println("light is red");

        } else System.out.println("light is green");

        return lightStatus;
    }

}



