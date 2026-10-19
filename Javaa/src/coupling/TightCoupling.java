package coupling;

class Engine1 {
	void start() {
		System.out.println("Car engine has been Started");
	}
}

class Car1 {
	Engine1 engine;

	public Car1(Engine1 engine) {
		this.engine = engine;
	}

	void drive() {
		engine.start();

		System.out.println("Driving the acr");

	}
}

public class TightCoupling {
	public static void main(String[] args) {
		Engine1 e1 = new Engine1();
		Car1 c1 = new Car1(e1);
		c1.drive();

	}
}
