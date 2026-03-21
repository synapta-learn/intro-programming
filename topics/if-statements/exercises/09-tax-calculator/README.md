# Tax Calculator

## Problem

Write a method that calculates income tax based on progressive tax brackets. In a progressive system, different portions of income are taxed at different rates.

| Income Range           | Tax Rate |
|------------------------|----------|
| $0 - $10,000           | 10%      |
| $10,001 - $40,000      | 20%      |
| $40,001 and above      | 30%      |

**Important:** This is progressive, not flat. For example, if you earn $50,000:
- First $10,000 is taxed at 10% = $1,000
- Next $30,000 ($10,001 to $40,000) is taxed at 20% = $6,000
- Last $10,000 ($40,001 to $50,000) is taxed at 30% = $3,000
- **Total tax = $10,000**

Return the total tax as a `double`. If income is 0 or negative, return 0.

## Examples

```
calculateTax(5000)   → 500.0     (5000 * 0.10)
calculateTax(10000)  → 1000.0    (10000 * 0.10)
calculateTax(25000)  → 4000.0    (1000 + 3000)
calculateTax(50000)  → 10000.0   (1000 + 6000 + 3000)
calculateTax(0)      → 0.0
```

## Hint

Calculate the tax in each bracket separately. For income above $40,000, you pay taxes in all three brackets. Think about how much income "falls" into each bracket.
