package generics;

import java.util.ArrayList;

public class Laptop {
	String name;
	int price;

	public Laptop(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		ArrayList<Laptop> l1 = new ArrayList<Laptop>();
		l1.add(new Laptop("HP-Victus", 200000));
		l1.add(new Laptop("Asus", 190000));
		for (Laptop laptop : l1) {
			System.out.println(laptop);

		}

	}

}
