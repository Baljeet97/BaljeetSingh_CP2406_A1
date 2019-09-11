public class Main {

    public static void main(String[] args) {

        Road road1 = new Road(2, 8, 5, 0, 1);
        Vehicle car = new Vehicle(5, road1.getPositionAtX(), road1.getPositionAtY(), 1, "Black");
        Road road2 = new Road(8, -1, 0, 9, 2);
        TrafficLight light = new TrafficLight();

        System.out.println("--------------Car is on Road: " + road1.getRoad() + "--------------");
        while (car.getStartPointX() <= road1.endOfX() && car.getStartPointY() <= road1.endOfY()) {
            light.setState();

            if (road1.getLengthOfRoad() == 2) {
                car.moveCar();
                System.out.println("Car is moving on Road: " + road1.getRoad() + "" + " Segment: " + car.getStartPointY() + " " + light.lightStatus);
            }
        }

        if (car.getStartPointY() == road2.getPositionAtY() && light.getState() == 0) {
            car.stopCar();
            System.out.println("-------End of Road " + road1.getRoad() + " " + light.lightStatus + " Car is stopped" + "-------");

        } else if (light.getState() == 1) {
            System.out.println("--------------light is green at the end of the Road "+ road1.getRoad()+"--------------");
        }

        if (car.getStartPointY() == road2.getPositionAtY()) {
            car.setStartPointY();
            System.out.println("----------------Car continued onto Road " + road2.getRoad() + "----------------");
            while (car.getStartPointX() <= road2.endOfX() && car.getStartPointY() <= road2.endOfY()) {
                light.setState();
                car.moveCar();
                System.out.println("Car is moving on Road: " + road2.getRoad() + "" + " Segment: " + car.getStartPointY() + " " + light.lightStatus);
            }
            System.out.println("----------------End of Simulation---------------- ");
        }
    }
}

