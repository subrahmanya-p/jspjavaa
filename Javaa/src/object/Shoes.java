package object;

public class Shoes {
	String brand;
	String color;
	double price;

	public Shoes(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;

	}

	public String toString() {
		return this.brand + " " + this.color + " " + this.price;

	}

	public static void main(String[] args) {
		Shoes c1 = new Shoes("Puma", "black", 2000);
		System.out.println(c1);
	}

}
