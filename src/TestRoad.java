import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRoad {
    @Test
    void testRoad() {

        Road road = new Road(5, 2, 2, 0, 1);
        assertEquals(5, road.getLengthOfRoad());
        assertEquals(2, road.getRoadSegment());
        assertEquals(2, road.getPositionAtX());
        assertEquals(0, road.getPositionAtY());
        assertEquals(1, road.getRoad());
    }

    @Test
    void checkEndOfX() {
        Road road = new Road(5, 2, 2, 0, 1);
        assertEquals(7, road.endOfX());
    }

    @Test
    void checkEndOfY() {
        Road road = new Road(5, 2, 2, 0, 1);
        assertEquals(2, road.endOfY());
    }

}