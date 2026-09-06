package equals;

public class Pen {
	String name;

	public Pen(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Pen c1 = (Pen) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Pen c1 = new Pen("Doms");
		Pen c2 = new Pen("Doms");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
