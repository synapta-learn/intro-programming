class Coffee {
    private String description;
    private double price;

    public Coffee(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

class MilkDecorator extends Coffee {
    public MilkDecorator(Coffee base) {
        // TODO: call super with modified description and price
        // Description: base description + " + Milk"
        // Price: base price + 0.50
        super("", 0);
    }
}

class SugarDecorator extends Coffee {
    public SugarDecorator(Coffee base) {
        // TODO: call super with modified description and price
        // Description: base description + " + Sugar"
        // Price: base price + 0.25
        super("", 0);
    }
}
