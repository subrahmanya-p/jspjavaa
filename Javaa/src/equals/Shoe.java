package equals;

public class Shoe {
	String name;

	public Shoe(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Shoe c1 = (Shoe) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Shoe c1 = new Shoe("Nike");
		Shoe c2 = new Shoe("Puma");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
