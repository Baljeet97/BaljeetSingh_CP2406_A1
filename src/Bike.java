public class Bike extends Vehicle {

    int size = super.getSize() / 2;

    public Bike(int size, int startPointX, int startPointY, int speed, String color) {
        super(size, startPointX, startPointY, speed, color);
    }
}
