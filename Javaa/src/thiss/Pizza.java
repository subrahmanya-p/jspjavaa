package thiss;

public class Pizza {
	String name;
	int qty;
	String size;

	Pizza(String name) {
		this(name, 1);

	}

	Pizza(String name, int qty) {
		this(name, qty, "medium");
	}

	public Pizza(String name, int qty, String size) {
	
		this.name = name;
		this.qty = qty;
		this.size = size;
	}
	

	public String toString() {
		return "Pizza [name=" + name + ", qty=" + qty + ", size=" + size + "]";
	}

	public static void main(String[] args) {

		Pizza p1 = new Pizza("chicken Pizza");
		Pizza p2= new Pizza("panner Pizza",12);
		Pizza p3 = new Pizza(" soya Pizza",13,"large");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
