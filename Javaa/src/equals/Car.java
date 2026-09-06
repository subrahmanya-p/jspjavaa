package equals;

public class Car {
	String name;

	public Car(String name) {

		this.name = name;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Car c1 = (Car) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car("Fortuner");
		Car c2 = new Car("Thar");
		if (c1.equals(c2)) {
			System.out.println("Same Same");

		} else {
			System.out.println("Different");
		}
	}

}
