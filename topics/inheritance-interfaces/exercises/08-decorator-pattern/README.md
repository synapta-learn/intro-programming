# Decorator Pattern

## Problem

Implement a simple version of the decorator pattern using a coffee shop example. Each decorator wraps another coffee and adds to its price and description.

### Coffee
- Constructor: `Coffee(String description, double price)`
- `getDescription()` — returns the description
- `getPrice()` — returns the price

### MilkDecorator (extends Coffee)
- Constructor: `MilkDecorator(Coffee base)`
- `getDescription()` — returns `base.getDescription() + " + Milk"`
- `getPrice()` — returns `base.getPrice() + 0.50`

### SugarDecorator (extends Coffee)
- Constructor: `SugarDecorator(Coffee base)`
- `getDescription()` — returns `base.getDescription() + " + Sugar"`
- `getPrice()` — returns `base.getPrice() + 0.25`

## Examples

```java
Coffee c = new Coffee("Espresso", 2.00);
c.getDescription();  // "Espresso"
c.getPrice();        // 2.00

Coffee withMilk = new MilkDecorator(c);
withMilk.getDescription();  // "Espresso + Milk"
withMilk.getPrice();        // 2.50

Coffee withBoth = new SugarDecorator(withMilk);
withBoth.getDescription();  // "Espresso + Milk + Sugar"
withBoth.getPrice();        // 2.75

Coffee doubleSugar = new SugarDecorator(new SugarDecorator(c));
doubleSugar.getDescription();  // "Espresso + Sugar + Sugar"
doubleSugar.getPrice();        // 2.50
```

## Hints

- Each decorator stores a reference to the base Coffee object
- Decorators call `super(base.getDescription() + ..., base.getPrice() + ...)` in their constructor
- Decorators can be stacked — a decorator wrapping another decorator is perfectly fine
