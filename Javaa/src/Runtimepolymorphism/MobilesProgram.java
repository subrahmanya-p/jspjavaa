package Runtimepolymorphism;

class Mobiles1 {
	void features() {
		System.out.println("Here are the mobile Features");
	}
}

class Vivo extends Mobiles1 {
	void features() {
		System.out.println("Here are the Vivo mobile  features");
	}
}

class Oppo extends Mobiles1{
	void features() {
		System.out.println("Here are the Oppo mobile  features");
	}
}

class Redmi extends Mobiles1 {
	void features() {
		System.out.println("Here are the Redmi mobile  features");
	}
}

class Stimulator1 {
	public static void buy(Mobiles1 m1) {
		m1.features();

	}
}

public class MobilesProgram {

	public static void main(String[] args) {
		Mobiles1 o1 = new Oppo();
		Mobiles1 v1 = new Vivo();
		Mobiles1 r1 = new Redmi();
		Stimulator1.buy(r1);
		Stimulator1.buy(o1);
		Stimulator1.buy(v1);
	}

}
