package equals;

public class Bag {
	String name;

	public Bag(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Bag c1 = (Bag) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Bag c1 = new Bag("School Bag");
		Bag c2 = new Bag("Travel Bag");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
