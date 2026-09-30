package generics;

import java.util.ArrayList;

public class Shirt {
	String name;
	int price;
	public Shirt(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	

	public String toString() {
		return "Bike [name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ArrayList<Shirt> b1= new ArrayList<Shirt>();
		b1.add(new Shirt("rx100", 20000));
		b1.add(new Shirt("splendor", 190000));
		for (Shirt bike : b1) {
			System.out.println(bike);
			
		}

	}

}
