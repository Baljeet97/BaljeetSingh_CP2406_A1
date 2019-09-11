import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestBike {

    @Test
    void bikeTest() {

        Bike bike = new Bike(8, 3, 3, 5, "Red");
        assertEquals(4, bike.size);
        assertEquals(3, bike.getStartPointX());
        assertEquals(3, bike.getStartPointY());
        assertEquals(5, bike.getSpeed());
        assertEquals("Red", bike.getColor());
    }
}
