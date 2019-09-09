import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestBike {

    @Test
    void bikeTest() {

        Bike bike = new Bike();
        assertEquals(1, bike.size);
    }
}
