import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrintableInterfaceHiddenTest {

    @Test
    void printAllSingleItem() {
        Printable[] items = {new Book("Solo", "Author")};
        assertEquals("Book: Solo by Author", PrintableInterface.printAll(items));
    }

    @Test
    void printAllEmptyArray() {
        Printable[] items = {};
        assertEquals("", PrintableInterface.printAll(items));
    }

    @Test
    void invoiceWholeNumber() {
        Invoice i = new Invoice(100, 1000.00);
        assertEquals("Invoice #100: $1000.00", i.toPrintString());
    }

    @Test
    void gettersWork() {
        Book b = new Book("Title", "Author");
        assertEquals("Title", b.getTitle());
        assertEquals("Author", b.getAuthor());

        Invoice i = new Invoice(5, 25.50);
        assertEquals(5, i.getNumber());
        assertEquals(25.50, i.getAmount(), 0.001);
    }
}
