import dev.paulmatthews.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTests {

    // following is an example test. it always passes because it is asserting 10 == 10
    @Test
    @DisplayName("example test")
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    @DisplayName("test Car constructor")
    public void testInitialGasTank() {
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, testCar.getGasTankLevel(), .001);
    }

    // EXERCISE TODO: gasTankLevel is accurate after driving within tank range
    @Test
    @DisplayName("gasTank is accurate after driving")
    public void testTankAfterDriving() {
        // Arrange
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        // Action
        testCar.drive(100);
        // Assert
        assertEquals(8, testCar.getGasTankLevel(), .001);
    }
    // EXERCISE TODO: gasTankLevel is accurate after attempting to drive past tank range
    
    // EXERCISE TODO: Exception thrown when gas tank is overfilled
}
