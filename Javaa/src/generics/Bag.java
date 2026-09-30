package generics;

import java.util.ArrayList;

public class Bag {
	String name;
	int price;
	public Bag(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	

	public String toString() {
		return "Bag [name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ArrayList<Bag> b1= new ArrayList<Bag>();
		b1.add(new Bag("hp", 2000));
		b1.add(new Bag("expert", 1900));
		for (Bag bag : b1) {
			System.out.println(bag);
			
		}

	}

}
