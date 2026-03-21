interface Printable {
    String toPrintString();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toPrintString() {
        // TODO: return "Book: [title] by [author]"
        return "";
    }
}

class Invoice implements Printable {
    private int number;
    private double amount;

    public Invoice(int number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toPrintString() {
        // TODO: return "Invoice #[number]: $[amount]" (2 decimal places)
        return "";
    }
}

public class PrintableInterface {

    /**
     * Returns a single string with each item's toPrintString() on a separate line.
     * No trailing newline.
     */
    public static String printAll(Printable[] items) {
        // TODO: Concatenate all print strings separated by newlines
        return "";
    }
}
