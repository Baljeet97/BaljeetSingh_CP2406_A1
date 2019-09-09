import java.awt.*;

public class Vehicle {

    private int startPointX;
    private int startPointY;
    private String name = "Mustang";
    private Color color = Color.BLACK;
    private int speed;
    private int size;

    public Vehicle() {
        setSize(3);
        setSpeed(1);

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

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }


    int moveCar() { //moving vehicle by a step at a time
        startPointY += speed;
        return startPointY;
    }

    int stopCar() { //stopping Vehicle
        return startPointY;
    }
}
