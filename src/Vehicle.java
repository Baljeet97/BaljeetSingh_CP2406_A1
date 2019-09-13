class Vehicle {
    /*Creating vehicle*/

    private int startPointX;
    private int startPointY;
    private int size;
    private int speed;
    private String color;

    Vehicle(int size, int startPointX, int startPointY, int speed, String color) {
        this.size = size;
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.speed = speed;
        this.color = color;
    }

    int getStartPointX() {
        return startPointX;
    }

    int getStartPointY() {
        return startPointY;
    }

    void setStartPointY() {
        this.startPointY = 0;
    }

    int getSpeed() {
        return speed;
    }

    int getSize() {
        return size;
    }

    String getColor() {
        return color;
    }

    int moveCar() { // Moving car by one step at a time
        startPointY += speed;
        return startPointY;
    }

    int stopCar() { //stopping car
        return startPointY;
    }

}