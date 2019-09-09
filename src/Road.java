public class Road {

    private int lengthOfRoad;
    private int heightOfRoad;
    private int positionAtX;
    private int PositionAty;
    private int road;


    public Road(int lengthOfRoad, int heightOfRoad, int positionAtX, int PositionAty, int road) {
        this.lengthOfRoad = lengthOfRoad;
        this.heightOfRoad = heightOfRoad;
        this.positionAtX = positionAtX;
        this.PositionAty = PositionAty;
        this.road = road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getRoad() {
        return road;
    }

    public int getPositionAtX() {
        return positionAtX;
    }

    public void setPositionAtX(int positionAtX) {
        this.positionAtX = positionAtX;
    }

    public void setPositionAty(int positionAty) {
        PositionAty = positionAty;
    }

    public int getPositionAty() {
        return PositionAty;
    }

    public int getLengthOfRoad() {
        return lengthOfRoad;
    }

    public void setHeightOfRoad(int heightOfRoad) {
        this.heightOfRoad = heightOfRoad;
    }

    public int getHeightOfRoad() {
        return heightOfRoad;
    }

    public int endOfX() {
        return (getPositionAtX() + lengthOfRoad);
    }

    public int endOfY() {
        return (getPositionAty() + heightOfRoad);
    }

}
