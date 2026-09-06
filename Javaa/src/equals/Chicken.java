package equals;

public class Chicken {
	String name;

	public Chicken(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Chicken c1 = (Chicken) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Chicken c1 = new Chicken("Fried Chicken");
		Chicken c2 = new Chicken("Popcorn Chicken");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
