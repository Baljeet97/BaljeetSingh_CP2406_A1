import java.awt.*;

class Vehicle {

    private int startPointX;
    private int startPointy;
    private String name;
    private Color color;
    private int speed;

    public Vehicle(int startPointX, int startPointy, String name, Color color, int speed) {

        this.startPointX = startPointX;
        this.startPointy = startPointy;
        this.name = name;
        this.color = color;
        this.speed= speed;

    }
}
