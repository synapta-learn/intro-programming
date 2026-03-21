# Polymorphism and Review — Post-Class Review

## What You Learned

In this final topic you put polymorphism into practice and reviewed the full course. You worked with:

- **Dynamic dispatch** — calling methods on superclass variables that resolve to subclass implementations
- **Polymorphic collections** — storing mixed types in a single ArrayList and processing them uniformly
- **`instanceof`** — checking actual object types when needed
- **Design patterns** — strategy, observer/event, and command patterns using interfaces and polymorphism
- **Integration** — combining variables, loops, methods, classes, inheritance, and interfaces in complete programs

## Key Takeaways

**Polymorphism is about writing code that does not care about specific types.** When you write `for (Shape s : shapes) { total += s.area(); }`, you do not need to know whether each shape is a Circle, Rectangle, or Triangle. The code works with all of them, including types that do not exist yet.

**Good design avoids `instanceof` chains.** If you are writing `if (x instanceof A) ... else if (x instanceof B) ...`, consider adding a method to the base class or interface instead. Let polymorphism do the dispatching for you.

**Interfaces enable flexible design.** The strategy pattern, event system, and command pattern all rely on interfaces. By defining a contract, you can swap implementations without changing the code that uses them.

**The course concepts build on each other.** Variables lead to expressions, expressions lead to control flow, control flow leads to methods, methods lead to classes, classes lead to inheritance, and inheritance enables polymorphism. Each layer adds power by combining with the layers below it.

## Where to Go Next

You now have a solid foundation in programming with Java. From here, you might explore:

- **Data structures** — LinkedList, HashMap, TreeMap, and how they work internally
- **Algorithms** — sorting, searching, recursion, and their performance characteristics
- **File I/O** — reading and writing files, parsing structured data
- **Exception handling** — try/catch, custom exceptions, robust error handling
- **Java standard library** — Collections framework, Streams, java.time, and more
- **Design patterns** — Factory, Observer, Iterator, and other common solutions to recurring problems

Congratulations on completing the course.
