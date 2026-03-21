import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void carFuelCost() {
        Car c = new Car("Sedan", 300);
        assertEquals(35.0, c.fuelCost(), 0.01);
    }

    @Test
    void truckFuelCost() {
        Truck t = new Truck("Hauler", 150);
        assertEquals(40.0, t.fuelCost(), 0.01);
    }

    @Test
    void electricCarFuelCost() {
        ElectricCar ev = new ElectricCar("Tesla", 300);
        assertEquals(1.08, ev.fuelCost(), 0.01);
    }

    @Test
    void totalFleetCost() {
        Vehicle[] fleet = {
            new Car("Sedan", 300),
            new Truck("Hauler", 150),
            new ElectricCar("Tesla", 300)
        };
        assertEquals(76.08, Solution.totalFleetCost(fleet), 0.01);
    }
}
