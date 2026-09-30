package generics;

import java.util.ArrayList;

public class Mobile {
	String name;
	double price;

	public Mobile(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {

		ArrayList<Mobile> m1 = new ArrayList<Mobile>();
		m1.add(new Mobile("iphone", 60000.00));
		m1.add(new Mobile("realme", 6000.00));
		for (Mobile mobile : m1) {
			System.out.println(mobile);

		}
	}

}
