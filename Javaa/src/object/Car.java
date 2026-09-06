package object;

public class Car {
	String name;
	String color;
	double price;

	public Car(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;

	}

	public String toString() {
		return this.name + " " + this.color + " " + this.price;

	}

	public static void main(String[] args) {
		Car c1 = new Car("fortuner", "white", 450000);
		System.out.println(c1);
	}

}
