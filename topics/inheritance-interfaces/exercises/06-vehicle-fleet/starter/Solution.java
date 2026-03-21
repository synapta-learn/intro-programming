abstract class Vehicle {
    private String name;
    private double milesDriven;

    public Vehicle(String name, double milesDriven) {
        this.name = name;
        this.milesDriven = milesDriven;
    }

    public String getName() {
        return name;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public abstract double fuelCost();
}

class Car extends Vehicle {
    public Car(String name, double milesDriven) {
        super(name, milesDriven);
    }

    @Override
    public double fuelCost() {
        // TODO: (milesDriven / 30) * 3.50
        return 0;
    }
}

class Truck extends Vehicle {
    public Truck(String name, double milesDriven) {
        super(name, milesDriven);
    }

    @Override
    public double fuelCost() {
        // TODO: (milesDriven / 15) * 4.00
        return 0;
    }
}

class ElectricCar extends Vehicle {
    public ElectricCar(String name, double milesDriven) {
        super(name, milesDriven);
    }

    @Override
    public double fuelCost() {
        // TODO: milesDriven * 0.03 * 0.12
        return 0;
    }
}

public class Solution {

    /**
     * Returns the total fuel cost for all vehicles in the fleet.
     */
    public static double totalFleetCost(Vehicle[] vehicles) {
        // TODO: Sum the fuelCost() of every vehicle
        return 0;
    }
}
