# Printable Interface

## Problem

Define a `Printable` interface and implement it in two unrelated classes: `Book` and `Invoice`.

### Printable (interface)
- Method: `String toPrintString()` — returns a human-readable string representation

### Book (implements Printable)
- Constructor: `Book(String title, String author)`
- `getTitle()` — returns the title
- `getAuthor()` — returns the author
- `toPrintString()` — returns `"Book: [title] by [author]"`

### Invoice (implements Printable)
- Constructor: `Invoice(int number, double amount)`
- `getNumber()` — returns the invoice number
- `getAmount()` — returns the amount
- `toPrintString()` — returns `"Invoice #[number]: $[amount]"` with amount formatted to 2 decimal places

Also write a static utility method:

- **`Solution.printAll(Printable[] items)`** — returns a single String with each item's `toPrintString()` on a separate line (no trailing newline)

## Examples

```java
Book b = new Book("1984", "George Orwell");
b.toPrintString();  // "Book: 1984 by George Orwell"

Invoice i = new Invoice(42, 199.99);
i.toPrintString();  // "Invoice #42: $199.99"

Printable[] items = {b, i};
Solution.printAll(items);
// "Book: 1984 by George Orwell\nInvoice #42: $199.99"
```

## Hints

- An interface is declared with `interface Printable { ... }`
- Classes use `implements Printable` to adopt it
- `Solution.printAll` can use a StringBuilder or concatenate with `\n`
