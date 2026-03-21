import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void bookPrintString() {
        Book b = new Book("1984", "George Orwell");
        assertEquals("Book: 1984 by George Orwell", b.toPrintString());
    }

    @Test
    void invoicePrintString() {
        Invoice i = new Invoice(42, 199.99);
        assertEquals("Invoice #42: $199.99", i.toPrintString());
    }

    @Test
    void printAllCombines() {
        Printable[] items = {
            new Book("Dune", "Frank Herbert"),
            new Invoice(1, 50.00)
        };
        String result = Solution.printAll(items);
        assertEquals("Book: Dune by Frank Herbert\nInvoice #1: $50.00", result);
    }

    @Test
    void bookImplementsPrintable() {
        Printable p = new Book("Test", "Author");
        assertEquals("Book: Test by Author", p.toPrintString());
    }
}
