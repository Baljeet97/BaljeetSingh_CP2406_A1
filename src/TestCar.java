import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCar {

    @Test
    void testBus() {

        Car car = new Car(2, 4, 2, 10, "Green");
        assertEquals(2, car.getSize());
        assertEquals(4, car.getStartPointX());
        assertEquals(2, car.getStartPointY());
        assertEquals(10, car.getSpeed());
        assertEquals("Green", car.getColor());

    }
}
