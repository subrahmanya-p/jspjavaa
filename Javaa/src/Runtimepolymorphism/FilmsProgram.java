package Runtimepolymorphism;

class Films {
	void watch() {
		System.out.println("watch the films");
	}
}

class Comedy extends Films {
	void watch() {
		System.out.println("here is  the comedy film");
	}
}

class Romantic extends Films {
	void watch() {
		System.out.println("here is  the Romantic  film");
	}
}

class Action extends Films {
	void watch() {
		System.out.println("here is  the Action film");
	}
}

class Stimulator4 {
	static void select(Films f1) {
		f1.watch();

	}
}

public class FilmsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Films c1 = new Comedy();
		Films r1 = new Romantic();
		Films a1 = new Action();
		Stimulator4.select(c1);
		Stimulator4.select(r1);
		Stimulator4.select(a1);

	}

}
