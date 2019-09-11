public class Bus extends Vehicle {

    int size = super.getSize() * 3;

    public Bus(int size, int startPointX, int startPointY, int speed, String color) {
        super(size, startPointX, startPointY,speed, color);
    }
}
