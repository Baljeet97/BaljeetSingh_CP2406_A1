import java.awt.*;

class Vehicle {

    private int startPointX;
    private int startPointy;
    private String name;
    private Color color;
    private int speed;
    private int size;

    public Vehicle(int startPointX, int startPointy, String name, Color color, int speed, int size) {

        this.startPointX = startPointX;
        this.startPointy = startPointy;
        this.name = name;
        this.color = color;
        this.speed= speed;
        this.size = size;

    }

    public int getStartPointX() {
        return startPointX;
    }

    public int getStartPointy() {
        return startPointy;
    }

    public void setStartPointy(int startPointy) {
        this.startPointy = startPointy;
    }

    public int getSpeed() {
        return speed;
    }

    int moveCar(){
        startPointy += speed;
        return startPointy;

    }

    int stopCar(){
        return startPointy;

    }
}
