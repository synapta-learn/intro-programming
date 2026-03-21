# Vehicle Fleet

## Problem

Create a vehicle hierarchy and a fleet manager that computes total fuel costs.

### Vehicle (abstract)
- Constructor: `Vehicle(String name, double milesDriven)`
- `getName()` — returns the name
- `getMilesDriven()` — returns miles driven
- Abstract method `fuelCost()` — returns the total fuel cost as a double

### Car (extends Vehicle)
- Constructor: `Car(String name, double milesDriven)`
- `fuelCost()` — cars get 30 miles per gallon, gas costs $3.50/gallon. Cost = (milesDriven / 30) * 3.50

### Truck (extends Vehicle)
- Constructor: `Truck(String name, double milesDriven)`
- `fuelCost()` — trucks get 15 miles per gallon, diesel costs $4.00/gallon. Cost = (milesDriven / 15) * 4.00

### ElectricCar (extends Vehicle)
- Constructor: `ElectricCar(String name, double milesDriven)`
- `fuelCost()` — electric cars use 0.03 kWh per mile, electricity costs $0.12/kWh. Cost = milesDriven * 0.03 * 0.12

### Fleet (static method in Solution)
- **`Solution.totalFleetCost(Vehicle[] vehicles)`** — returns the total fuel cost for all vehicles

## Examples

```java
Car car = new Car("Sedan", 300);
car.fuelCost();  // 35.0  (300/30 * 3.50)

Truck truck = new Truck("Hauler", 150);
truck.fuelCost();  // 40.0  (150/15 * 4.00)

ElectricCar ev = new ElectricCar("Tesla", 300);
ev.fuelCost();  // 1.08  (300 * 0.03 * 0.12)

Vehicle[] fleet = {car, truck, ev};
Solution.totalFleetCost(fleet);  // 76.08
```

## Hints

- Each subclass has its own fuel efficiency formula
- `totalFleetCost` simply loops through the array and sums each vehicle's `fuelCost()`
