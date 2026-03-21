# Exercise: Time Breakdown

## Goal

Given a number of minutes since midnight, break it down into hours (0-23) and remaining minutes (0-59). Also determine if it is AM or PM.

## Method Signatures

```java
public static int getHours(int minutesSinceMidnight)
public static int getMinutes(int minutesSinceMidnight)
public static boolean isAM(int minutesSinceMidnight)
```

## Expected Behavior

```
getHours(135)    → 2     (2:15 AM)
getMinutes(135)  → 15
isAM(135)        → true

getHours(810)    → 13    (1:30 PM = 13:30 in 24h)
getMinutes(810)  → 30
isAM(810)        → false

getHours(0)      → 0     (midnight)
getMinutes(0)    → 0
isAM(0)          → true

getHours(720)    → 12    (noon)
getMinutes(720)  → 0
isAM(720)        → false
```

## Instructions

1. Open `Solution.java`
2. `getHours` should return the hour in 24-hour format (0-23)
3. `getMinutes` should return the remaining minutes (0-59)
4. `isAM` should return `true` if the time is before noon (hours 0-11)

## Hints

- Hours: `minutesSinceMidnight / 60`
- Minutes: `minutesSinceMidnight % 60`
- AM means the hour is less than 12
- Assume input is always in the range 0-1439 (0:00 to 23:59)
