package Runtimepolymorphism;

class Amazon {
	void buy() {
		System.out.println("You camn Buy  anything from Amazon");
	}
}

class Shoes extends Amazon {
	void buy() {
		System.out.println("You can buy the shoes from Amazon");
	}
}

class Dress extends Amazon {
	void buy() {
		System.out.println("You can buy the Dress from Amazon");
	}
}

class Mobiles extends Amazon {
	void buy() {
		System.out.println("You can buy the Mobiles from Amazon");
	}
}

class Stimulator2 {
	static void Purchase(Amazon a1) {
		a1.buy();

	}
}

public class AmazonProgram {

	public static void main(String[] args) {
		Amazon dr1 = new Dress();
		Amazon mo1 = new Mobiles();
		Amazon s1 = new Shoes();
		Stimulator2.Purchase(dr1);
		Stimulator2.Purchase(mo1);
		Stimulator2.Purchase(s1);

	}

}
