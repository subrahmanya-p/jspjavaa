package equals;

public class Shirt {
	String name;

	public Shirt(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Shirt c1 = (Shirt) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Shirt c1 = new Shirt("Formal Shirt");
		Shirt c2 = new Shirt("Casual Shirt");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
