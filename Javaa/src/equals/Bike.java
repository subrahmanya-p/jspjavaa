package equals;

public class Bike {
	String name;

	public Bike(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Bike c1 = (Bike) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Bike c1 = new Bike("Pulsar");
		Bike c2 = new Bike("GT");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
