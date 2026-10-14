
package patterndesign;

public class Book {
    private static Book book;
    String color = "red";

    private Book() {
    }

    public static Book getInstance() {
        if (book == null) {
            book = new Book();
        }
        return book;
    }

    public static void main(String[] args) {
        Book b1 = Book.getInstance();
        System.out.println(b1.color);

        Book b2 = Book.getInstance();

        if (b1 == b2) {
            System.out.println("same");
        }
    }
}
