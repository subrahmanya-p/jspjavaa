package generics;

import java.util.ArrayList;

public class Fridge {
	String name;
	int price;
	public Fridge(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	

	public String toString() {
		return "Fridge [name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ArrayList<Fridge> f1= new ArrayList<Fridge>();
		f1.add(new Fridge("samsung", 20000));
		f1.add(new Fridge("lenovo", 190000));
		for (Fridge fridge : f1) {
			System.out.println(fridge);
			
		}

	}

}
