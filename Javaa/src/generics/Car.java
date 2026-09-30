package generics;

import java.util.ArrayList;

public class Car {
	String name;
	int price;
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	

	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		ArrayList<Car> c1= new ArrayList<Car>();
		c1.add(new Car("bmww", 20000));
		c1.add(new Car("alto", 190000));
		for (Car car : c1) {
			System.out.println(car);
			
		}

	}

}
