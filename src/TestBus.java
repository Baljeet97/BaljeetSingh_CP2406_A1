import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBus {

    @Test
    void testBus() {

        Bus bus = new Bus(6, 5, 4, 5, "Blue");
        assertEquals(18, bus.size);
        assertEquals(5, bus.getStartPointX());
        assertEquals(4, bus.getStartPointY());
        assertEquals(5, bus.getSpeed());
        assertEquals("Blue", bus.getColor());

    }
}
