# Methods — Post-Class Review

## What You Learned

In this topic you practiced the most important skill in programming: **breaking problems into methods**. You worked with:

- **Overloading** — same method name, different parameter types
- **Return values** — computing and returning results from methods
- **Helper methods** — calling one method from another
- **Array-processing methods** — min, max, average on arrays
- **Validation methods** — methods that return boolean

## Key Takeaways

**Methods should do one thing.** If you are struggling to name a method, it probably does too much. Split it up. A method called `processData` is suspicious. A method called `calculateAverage` is clear.

**The return value is the main output.** Prefer returning values over printing them. A method that returns a value can be tested, combined with other methods, and used in expressions. A method that prints is harder to reuse.

**Overloading is about convenience, not magic.** When you write `min(int, int)` and `min(double, double)`, you are simply providing two versions of the same concept. Java picks the right one based on the arguments.

**Local variables are truly local.** Every method starts fresh. You cannot access variables from another method — you can only receive values through parameters and send values back through `return`.

## Common Patterns to Remember

```java
// Method with a single responsibility
public static boolean isValid(int value) {
    return value >= 0 && value <= 100;
}

// Method that uses a helper
public static boolean isPalindrome(String s) {
    String reversed = reverseString(s);
    return s.equals(reversed);
}

// Overloaded methods
public static int min(int a, int b) { ... }
public static double min(double a, double b) { ... }

// Array-processing method
public static double average(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return (double) sum / numbers.length;
}
```

## What Comes Next

With methods in your toolkit, you can start writing well-organized programs. The next topics will build on methods by introducing **objects and classes** — where methods and data live together in a single unit.
