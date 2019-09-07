public class Road {

    private int lengthOfRoad;
    private int heightOfRoad;
    private int positionAtX;
    private int getPositionAty;
    private int road;


    public Road(int lengthOfRoad, int heightOfRoad, int positionAtX, int getPositionAty, int road) {
        this.lengthOfRoad = lengthOfRoad;
        this.heightOfRoad = heightOfRoad;
        this.positionAtX = positionAtX;
        this.getPositionAty = getPositionAty;
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

    public void setGetPositionAty(int getPositionAty) {
        this.getPositionAty = getPositionAty;
    }

    public int getGetPositionAty() {
        return getPositionAty;
    }

    public int getLengthOfRoad() {
        return lengthOfRoad;
    }


}
