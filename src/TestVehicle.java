import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestVehicle {

    @Test
    void checkVehicle() {

        Vehicle vehicle = new Vehicle(3, 0, 0, 2, "Black");
        assertEquals(0, vehicle.getStartPointX());
        assertEquals(0, vehicle.getStartPointY());
        assertEquals(3, vehicle.getSize());
        assertEquals(2, vehicle.getSpeed());
        assertEquals("Black", vehicle.getColor());
    }

    @Test
    void checkCarMove() {
        Vehicle vehicle = new Vehicle(3, 0, 0, 2, "Black");
        assertEquals(1, vehicle.moveCar());
    }

    @Test
    void testStopCar() {
        Vehicle vehicle = new Vehicle(3, 0, 0, 2, "Black");
        assertEquals(0, vehicle.stopCar());
    }

}