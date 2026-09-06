package equals;

public class Laptop {
	String name;

	public Laptop(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Laptop c1 = (Laptop) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Laptop c1 = new Laptop("Dell");
		Laptop c2 = new Laptop("HP");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
