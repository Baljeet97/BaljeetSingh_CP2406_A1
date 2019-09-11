public class Road {

    private int lengthOfRoad;
    private int roadSegment;
    private int positionAtX;
    private int positionAtY;
    private int road;

    public Road(int lengthOfRoad, int roadSegment, int positionAtX, int positionAtY, int road) {
        this.lengthOfRoad = lengthOfRoad;
        this.roadSegment = roadSegment;
        this.positionAtX = positionAtX;
        this.positionAtY = positionAtY;
        this.road = road;
    }


    int getRoad() {
        return road;
    }

    int getPositionAtX() {
        return positionAtX;
    }

    int getPositionAtY() {
        return positionAtY;
    }

    int getLengthOfRoad() {
        return lengthOfRoad;
    }

    int getRoadSegment() {
        return roadSegment;
    }

    int endOfX() {
        return (getPositionAtX() + lengthOfRoad);
    }

    int endOfY() {
        return (getPositionAtY() + roadSegment);
    }

}

