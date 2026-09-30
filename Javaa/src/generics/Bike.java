package generics;

import java.util.ArrayList;

public class Bike {
	String name;
	int price;
	public Bike(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	

	public String toString() {
		return "Bike [name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ArrayList<Bike> b1= new ArrayList<Bike>();
		b1.add(new Bike("rx100", 20000));
		b1.add(new Bike("splendor", 190000));
		for (Bike bike : b1) {
			System.out.println(bike);
			
		}

	}

}
