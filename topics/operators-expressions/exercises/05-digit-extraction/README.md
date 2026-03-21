# Exercise: Digit Extraction

## Goal

Extract the ones, tens, and hundreds digits from a 3-digit number using the `/` and `%` operators.

## Method Signatures

```java
public static int onesDigit(int number)
public static int tensDigit(int number)
public static int hundredsDigit(int number)
```

## Expected Behavior

For the number `735`:
```
onesDigit(735)      → 5
tensDigit(735)      → 3
hundredsDigit(735)  → 7
```

For the number `402`:
```
onesDigit(402)      → 2
tensDigit(402)      → 0
hundredsDigit(402)  → 4
```

## Instructions

1. Open `Solution.java`
2. Use `%` (modulo) and `/` (integer division) to extract each digit
3. The input will always be a positive 3-digit number (100-999)

## How It Works

Think about what `%` and `/` do:

- `735 % 10` gives `5` (the ones digit)
- `735 / 10` gives `73` (removes the ones digit)
- `73 % 10` gives `3` (the tens digit)
- `735 / 100` gives `7` (the hundreds digit)

## Hints

- **Ones digit:** `number % 10`
- **Tens digit:** `(number / 10) % 10`
- **Hundreds digit:** `number / 100`
