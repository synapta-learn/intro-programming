# Simple Date

## Problem

Create a `Solution` class that represents a simple date. It should have:

- Fields: `day`, `month`, `year` (all `int`)
- `isValid()` — returns `true` if the date is valid. Rules:
  - Year must be >= 1
  - Month must be 1-12
  - Day must be valid for the month (use 28 days for February — ignore leap years)
- `nextDay()` — advances the date by one day. Handles month and year roll-over.
- `toString()` — returns the date as `"YYYY-MM-DD"` (with zero-padding for month and day)

Days per month (no leap years): Jan=31, Feb=28, Mar=31, Apr=30, May=31, Jun=30, Jul=31, Aug=31, Sep=30, Oct=31, Nov=30, Dec=31

## Examples

```java
Solution date = new Solution();
date.year = 2024;
date.month = 3;
date.day = 15;
date.isValid();    // true
date.toString();   // "2024-03-15"

date.nextDay();
date.toString();   // "2024-03-16"

// End of month
Solution endOfMonth = new Solution();
endOfMonth.year = 2024;
endOfMonth.month = 1;
endOfMonth.day = 31;
endOfMonth.nextDay();
// Now: 2024-02-01
```

## Hints

- Store days-per-month in an array: `{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}`
- For `nextDay()`: increment day. If day > days in current month, reset day to 1 and increment month. If month > 12, reset month to 1 and increment year.
- For `toString()` zero-padding: use `String.format("%04d-%02d-%02d", year, month, day)` or build it manually
