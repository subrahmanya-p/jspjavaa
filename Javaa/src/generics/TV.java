package generics;

import java.util.ArrayList;

public class TV {
	String name;
	int price;
	public TV(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	

	public String toString() {
		return "TV [name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ArrayList<TV> t1= new ArrayList<TV>();
		t1.add(new TV("samsung", 200000));
		t1.add(new TV("lenovo", 1900000));
		for (TV tv : t1) {
			System.out.println(tv);
			
		}

	}

}
