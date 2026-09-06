package Runtimepolymorphism;

class LG {
	void select() {
		System.out.println("LG products");
	}
}

class Mobiles2 extends LG {
	void select() {
		System.out.println("Here is the LG Mobiles");
	}
}

class Refrigerators extends LG {
	void select() {
		System.out.println("Here is the LG Refrigerators ");
	}
}

class Television extends LG {
	void select() {
		System.out.println("Here is the LG Television");
	}
}

class Stimulator {
	public static void Buy(LG l1) {
		l1.select();

	}
}

public class LGProgram {
	public static void main(String[] args) {

		LG m1 = new Mobiles2();
		LG r1 = new Refrigerators();
		LG t1 = new Television();
		Stimulator.Buy(t1);
		Stimulator.Buy(r1);
		Stimulator.Buy(m1);

	}
}
