import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestCar {

    @Test
    void testBus() {

        Car car = new Car();
        assertEquals(1, car.getSpeed());

    }
}
