import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void zeroMilesCostNothing() {
        assertEquals(0.0, new Car("C", 0).fuelCost(), 0.001);
        assertEquals(0.0, new Truck("T", 0).fuelCost(), 0.001);
        assertEquals(0.0, new ElectricCar("E", 0).fuelCost(), 0.001);
    }

    @Test
    void emptyFleet() {
        assertEquals(0.0, Solution.totalFleetCost(new Vehicle[]{}), 0.001);
    }

    @Test
    void fleetOfSameType() {
        Vehicle[] fleet = {new Car("A", 60), new Car("B", 90)};
        // A: 60/30 * 3.50 = 7.0, B: 90/30 * 3.50 = 10.5
        assertEquals(17.5, Solution.totalFleetCost(fleet), 0.01);
    }
}
