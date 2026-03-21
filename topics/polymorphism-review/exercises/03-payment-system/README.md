# Payment System

## Problem

Build a payment processing system using an interface and multiple implementations.

### Payment (interface)
- `double getAmount()` — returns the payment amount
- `String getMethod()` — returns the payment method name
- `String receipt()` — returns a receipt string

### CreditCard (implements Payment)
- Constructor: `CreditCard(double amount, String cardNumber)`
- `getAmount()` — returns the amount
- `getMethod()` — returns `"Credit Card"`
- `receipt()` — returns `"Paid $[amount] via Credit Card ending in [last 4 digits]"` (amount to 2 decimal places)

### BankTransfer (implements Payment)
- Constructor: `BankTransfer(double amount, String bankName)`
- `getAmount()` — returns the amount
- `getMethod()` — returns `"Bank Transfer"`
- `receipt()` — returns `"Paid $[amount] via Bank Transfer from [bankName]"` (amount to 2 decimal places)

### Cash (implements Payment)
- Constructor: `Cash(double amount)`
- `getAmount()` — returns the amount
- `getMethod()` — returns `"Cash"`
- `receipt()` — returns `"Paid $[amount] in Cash"` (amount to 2 decimal places)

### Utility (static in Solution)
- **`Solution.processAll(ArrayList<Payment> payments)`** — returns an `ArrayList<String>` of receipts, one per payment
- **`Solution.totalAmount(ArrayList<Payment> payments)`** — returns the sum of all payment amounts

## Examples

```java
CreditCard cc = new CreditCard(99.99, "4111222233334444");
cc.receipt();  // "Paid $99.99 via Credit Card ending in 4444"

BankTransfer bt = new BankTransfer(500.00, "Chase");
bt.receipt();  // "Paid $500.00 via Bank Transfer from Chase"

Cash cash = new Cash(20.00);
cash.receipt();  // "Paid $20.00 in Cash"
```

## Hints

- For the last 4 digits of the card number, use `cardNumber.substring(cardNumber.length() - 4)`
- Use `String.format("%.2f", amount)` for formatting
- `processAll` loops through and calls `receipt()` on each payment
