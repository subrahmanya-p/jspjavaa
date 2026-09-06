package object;

public class Mobile {
	String name;
	String color;
	double price;

	public Mobile(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;

	}

	public String toString() {
		return this.name + " " + this.color + " " + this.price;

	}

	public static void main(String[] args) {
		Mobile c1 = new Mobile("iphone", "black", 50000);
		System.out.println(c1);
	}

}
