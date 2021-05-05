package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {


    @Test
    public void shouldAccelerate() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
}
