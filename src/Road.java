public class Road {
    /* Creating Road*/

    private int lengthOfRoad;
    private int roadSegment;
    private int startOfRoad;
    private int endOfRoad;
    private int road;

    public Road(int lengthOfRoad, int roadSegment, int startOfRoad, int endOfRoad, int road) {
        this.lengthOfRoad = lengthOfRoad;
        this.roadSegment = roadSegment;
        this.startOfRoad = startOfRoad;
        this.endOfRoad = endOfRoad;
        this.road = road;
    }

    int getRoad() {
        return road;
    }

    int getStartOfRoad() {
        return startOfRoad;
    }

    int getEndOfRoad() {
        return endOfRoad;
    }

    int getLengthOfRoad() {
        return lengthOfRoad;
    }

    int getRoadSegment() {
        return roadSegment;
    }

    int endOfX() { //
        return (getStartOfRoad() + lengthOfRoad);
    }

    int endOfY() { //
        return (getEndOfRoad() + roadSegment);
    }

}

