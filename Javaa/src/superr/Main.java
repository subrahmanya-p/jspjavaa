package superr;

class Parent {
	public Parent() {
		System.out.println("Im a Parent Constrctor");
	}

}

class Child extends Parent {
	public Child() {
		super();
		System.out.println("Ima a child Constrctor");
	}

}

public class Main {
	public static void main(String[] args) {
		 new Child();

	}

}
