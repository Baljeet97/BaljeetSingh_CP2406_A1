public class Main {
    /*Main class to run the simulation*/

    public static void main(String[] args) {

        Road road1 = new Road(2, 8, 5, 0, 1); //setting road 1
        Vehicle car = new Vehicle(5, road1.getStartOfRoad(), road1.getEndOfRoad(), 1, "Black"); // setting vehicle
        Road road2 = new Road(8, -1, 0, 9, 2); //setting road 2
        TrafficLight light = new TrafficLight();

        System.out.println("--------------Car is on Road: " + road1.getRoad() + "--------------");
        while (car.getStartPointX() <= road1.endOfX() && car.getStartPointY() <= road1.endOfY()) { // checking if the car is not at the end of road
            light.setState();

            if (road1.getLengthOfRoad() == 2) { //if road length is not exceeded
                car.moveCar();
                System.out.println("Car is moving on Road: " + road1.getRoad() + "" + " Segment: " + car.getStartPointY() + " " + light.lightStatus);
            }
        }

        if (car.getStartPointY() == road2.getEndOfRoad() && light.getState() == 0) { // if car is at end of road 1 and light is red
            car.stopCar();
            System.out.println("-------End of Road " + road1.getRoad() + " " + light.lightStatus + " Car is stopped" + "-------");

        } else if (light.getState() == 1) {
            System.out.println("--------------light is green at the end of the Road " + road1.getRoad() + " --------------");
        }

        if (car.getStartPointY() == road2.getEndOfRoad()) { // if car finished road 1
            car.setStartPointY();
            System.out.println("----------------Car continued onto Road " + road2.getRoad() + "----------------");
            while (car.getStartPointX() <= road2.endOfX() && car.getStartPointY() <= road2.endOfY()) { // if car is not outside road 2
                light.setState();
                car.moveCar();
                System.out.println("Car is moving on Road: " + road2.getRoad() + "" + " Segment: " + car.getStartPointY() + " " + light.lightStatus);
            }
            System.out.println("----------------End of Simulation---------------- ");
        }
    }
}

