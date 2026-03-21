# Bank Account

## Problem

Create a `Solution` class that represents a bank account. It should have:

- A `double` field for the balance (starts at 0)
- `deposit(double amount)` — adds the amount to the balance. Ignores negative or zero amounts.
- `withdraw(double amount)` — subtracts the amount from the balance. Ignores negative or zero amounts. Does **not** allow the balance to go below 0 (reject the withdrawal if it would cause overdraft).
- `getBalance()` — returns the current balance

## Examples

```java
Solution account = new Solution();
account.getBalance();      // 0.0
account.deposit(1000.0);
account.getBalance();      // 1000.0
account.withdraw(300.0);
account.getBalance();      // 700.0
account.withdraw(800.0);   // rejected — would cause overdraft
account.getBalance();      // 700.0 (unchanged)
account.deposit(-50.0);    // ignored — negative amount
account.getBalance();      // 700.0 (unchanged)
```

## Hints

- Check that the amount is positive before depositing or withdrawing
- For withdrawal, also check that the amount does not exceed the current balance
- These checks are **guard clauses** — if the condition is not met, simply return without doing anything
