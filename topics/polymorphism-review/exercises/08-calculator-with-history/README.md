# Calculator with History

## Problem

Build a calculator that records every operation as a **Command** object. Each command knows how to execute itself and how to undo itself, enabling full undo support.

### Command (interface)
- `double execute(double currentValue)` — applies the operation to the current value and returns the new value
- `double undo(double currentValue)` — reverses the operation and returns the previous value
- `String describe()` — returns a human-readable description of the operation

### AddCommand
- Constructor: `AddCommand(double operand)`
- `execute(v)` returns `v + operand`
- `undo(v)` returns `v - operand`
- `describe()` returns `"+ [operand]"` (formatted to 1 decimal place)

### MultiplyCommand
- Constructor: `MultiplyCommand(double operand)`
- `execute(v)` returns `v * operand`
- `undo(v)` returns `v / operand`
- `describe()` returns `"* [operand]"` (formatted to 1 decimal place)

### Calculator
- Constructor: `Calculator()` — starts with value `0.0`
- `apply(Command cmd)` — executes the command, updates the current value, and records it in history
- `undo()` — undoes the most recent command and removes it from history. Does nothing if history is empty.
- `getValue()` — returns the current value
- `getHistory()` — returns a new `ArrayList<String>` of command descriptions, in order applied

## Examples

```java
Calculator calc = new Calculator();
calc.apply(new AddCommand(10));      // value: 10
calc.apply(new MultiplyCommand(3));  // value: 30
calc.apply(new AddCommand(-5));      // value: 25

calc.getValue();     // 25.0
calc.getHistory();   // ["+ 10.0", "* 3.0", "+ -5.0"]

calc.undo();         // undoes "+ -5.0", value: 30
calc.undo();         // undoes "* 3.0", value: 10
calc.getValue();     // 10.0
calc.getHistory();   // ["+ 10.0"]
```

## Hints

- Use an `ArrayList<Command>` for history
- `apply` calls `cmd.execute(currentValue)` and saves the result
- `undo` gets the last command from history, calls its `undo`, and removes it from the list
- `String.format("%.1f", operand)` for formatting
