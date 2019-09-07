import java.awt.*;

public class Vehicle {

    private int startPointX;
    private int startPointy;
    private String name;
    private Color color;
    private int speed;
    private int size;

    public Vehicle(){
        setSize(1);
        setSpeed(0);

    }

    public int getStartPointX() {
        return startPointX;
    }

    public int getStartPointy() {
        return startPointy;
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

    public void setStartPointy(int startPointy) {
        this.startPointy = startPointy;
    }

    public int getSpeed() {
        return speed;
    }

    int moveCar() { //moving vehicle by step at a time
        startPointy += speed;
        return startPointy;
    }

    int stopCar() { //stopping car
        return startPointy;
    }
}
