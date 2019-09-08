import java.awt.*;

public class Vehicle {

    private int startPointX;
    private int startPointY;
    private String name;
    private Color color;
    private int speed;
    private int size;

    public Vehicle() {
        setSize(1);
        setSpeed(0);

    }

    public int getStartPointX() {
        return startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public int getSize() {
        return size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStartPointY(int startPointy) {
        this.startPointY = startPointy;
    }

    public int getSpeed() {
        return speed;
    }

    int moveCar() { //moving vehicle by a step at a time
        startPointY += speed;
        return startPointY;
    }

    int stopCar() { //stopping Vehicle
        return startPointY;
    }
}
