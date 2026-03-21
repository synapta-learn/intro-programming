# Exercise: Time Converter

## Goal

Convert a total number of seconds into hours, minutes, and remaining seconds.

Implement three methods that each extract one component:

## Method Signatures

```java
public static int toHours(int totalSeconds)
public static int toMinutes(int totalSeconds)
public static int toSeconds(int totalSeconds)
```

## Expected Behavior

For `totalSeconds = 3661` (which is 1 hour, 1 minute, 1 second):

```
toHours(3661)   → 1
toMinutes(3661) → 1
toSeconds(3661) → 1
```

For `totalSeconds = 7325` (which is 2 hours, 2 minutes, 5 seconds):

```
toHours(7325)   → 2
toMinutes(7325) → 2
toSeconds(7325) → 5
```

## Instructions

1. Open `Solution.java`
2. Implement each method using integer division `/` and modulo `%`
3. `toHours`: divide total seconds by 3600
4. `toMinutes`: get the remaining seconds after removing hours, then divide by 60
5. `toSeconds`: get the remaining seconds after removing full minutes

## Hints

- There are 3600 seconds in an hour (60 * 60)
- There are 60 seconds in a minute
- Use `/` for integer division and `%` for remainder
- `toMinutes` needs to remove the hours first: `(totalSeconds % 3600) / 60`
- `toSeconds` needs the remainder after full minutes: `totalSeconds % 60`
