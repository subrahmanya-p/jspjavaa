package object;

public class Bike {
	String name;
	String color;
	double price;

	public Bike(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;

	}

	public String toString() {
		return this.name + " " + this.color + " " + this.price;

	}

	public static void main(String[] args) {
		Bike c1 = new Bike("gt650", "chrome", 500000);
		System.out.println(c1);
	}

}
