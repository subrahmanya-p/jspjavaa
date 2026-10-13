package thiss;

public class Book {
	String name;
	double price;

	Book(String name) {
		this(name, 56.9);

	}

	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	Book(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public static void main(String[] args) {
		Book b1 = new Book("clasMate");
		Book b2 = new Book("thunturu ", 579);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}
