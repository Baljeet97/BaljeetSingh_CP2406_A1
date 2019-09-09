import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TestVehicle {

    @Test
    void checkVehicle() {

        Vehicle vehicle = new Vehicle();

        assertEquals(0, vehicle.getStartPointX());
        assertEquals(0, vehicle.getStartPointY());
        assertEquals(3, vehicle.getSize());
        assertEquals(1, vehicle.getSpeed());
        assertEquals("Mustang", vehicle.getName());
        assertEquals(Color.BLACK, vehicle.getColor());
    }

    @Test
    void checkCarMove() {
        Vehicle vehicle = new Vehicle();
        assertEquals(1, vehicle.moveCar());
    }

    @Test
    void testStopCar() {
        Vehicle vehicle = new Vehicle();
        assertEquals(0, vehicle.stopCar());
    }

}