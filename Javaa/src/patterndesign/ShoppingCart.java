package patterndesign;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private static ShoppingCart cart;

	List<String> l1 = new ArrayList<String>();

	private ShoppingCart() {
		// TODO Auto-generated constructor stub
	}

	public void addProduct(String product) {
		l1.add(product);

	}

	public void displayProduct() {
		System.out.println(l1);

	}

	public static ShoppingCart getShoppingCart() {
		if (cart == null) {
			cart = new ShoppingCart();
		}

		return cart;

	}

	public static void main(String[] args) {
		ShoppingCart s1;
		s1 = ShoppingCart.getShoppingCart();
		s1.addProduct("shoes");
		s1.addProduct("car");
		s1.addProduct("bike");
		s1.addProduct("remote");
		s1.addProduct("shirt");
		s1.displayProduct();
	}
}
