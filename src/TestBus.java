import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

class TestBus {


    @Test
    void testBus() {

        Bus bus = new Bus();
        assertEquals(9, bus.size);

    }
}
