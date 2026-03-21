class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        // TODO: return "Employee: [name] ($[salary])" with 2 decimal places
        return "";
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotalCompensation() {
        // TODO: return salary + bonus
        return 0;
    }

    @Override
    public String toString() {
        // TODO: return "Manager: [name] ($[salary] + $[bonus] bonus)"
        return "";
    }
}

class Intern extends Employee {
    public Intern(String name) {
        // TODO: call super with salary = 0
        super(name, 0);
    }

    @Override
    public String toString() {
        // TODO: return "Intern: [name] (unpaid)"
        return "";
    }
}
