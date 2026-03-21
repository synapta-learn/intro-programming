# Stopwatch

## Problem

Create a `Solution` class that acts as a stopwatch. Rather than using real time (which is hard to test), this stopwatch uses manually added time. It should support:

- `start()` — starts the stopwatch. Does nothing if already running.
- `stop()` — stops the stopwatch. Does nothing if not running.
- `addTime(long ms)` — simulates the passage of time by adding milliseconds. Only accumulates time if the stopwatch is running.
- `getElapsedMs()` — returns the total elapsed time in milliseconds across all start/stop periods.
- `isRunning()` — returns `true` if the stopwatch is currently running.
- `reset()` — resets elapsed time to 0 and stops the stopwatch.

## Examples

```java
Solution sw = new Solution();
sw.isRunning();    // false
sw.start();
sw.isRunning();    // true
sw.addTime(1000);
sw.getElapsedMs(); // 1000
sw.stop();
sw.getElapsedMs(); // 1000 (preserved after stop)
sw.start();
sw.addTime(500);
sw.getElapsedMs(); // 1500 (accumulated)
sw.reset();
sw.getElapsedMs(); // 0
sw.isRunning();    // false
```

## Hints

- Track whether the stopwatch is running with a `boolean` field
- Track total elapsed time with a `long` field
- `addTime()` only adds to elapsed if the stopwatch is running
- `reset()` sets elapsed to 0 and running to false
