package generics;

import java.util.ArrayList;

public class KeyBoard {
	String name;
	int price;

	public KeyBoard(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "KeyBoard [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		ArrayList<KeyBoard> k1 = new ArrayList<KeyBoard>();
		k1.add(new KeyBoard("katana", 20000));
		k1.add(new KeyBoard("hp", 190000));
		for (KeyBoard keyboard : k1) {
			System.out.println(keyboard);

		}

	}

}
