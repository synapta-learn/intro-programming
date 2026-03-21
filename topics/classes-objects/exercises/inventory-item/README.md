# Inventory Item

## Problem

Create a `Solution` class that represents an item in an inventory system. It should have:

- Fields: `name` (String), `quantity` (int, starts at 0), `price` (double)
- `restock(int amount)` — adds the amount to quantity. Ignores non-positive amounts.
- `sell(int amount)` — subtracts the amount from quantity. Ignores non-positive amounts. Cannot sell more than available (reject if amount > quantity).
- `getQuantity()` — returns current quantity
- `getTotalValue()` — returns quantity * price
- `isInStock()` — returns true if quantity > 0

## Examples

```java
Solution item = new Solution();
item.name = "Widget";
item.price = 9.99;

item.restock(100);
item.getQuantity();    // 100
item.getTotalValue();  // 999.0
item.isInStock();      // true

item.sell(30);
item.getQuantity();    // 70

item.sell(200);        // rejected — not enough stock
item.getQuantity();    // 70 (unchanged)
```

## Hints

- Similar to BankAccount — guard against invalid operations
- `getTotalValue()` multiplies the current quantity by the price
- Remember to handle edge cases: selling 0, restocking negative amounts
