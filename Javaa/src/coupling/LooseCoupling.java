package coupling;

//import com.sun.org.apache.xml.internal.security.c14n.helper.C14nHelper;

class Engine {
	void start() {
		System.out.println("Car engine has been Started");
	}
}

class Car {
	Engine e1 = new Engine();

	void drive() {
		e1.start();
		System.out.println("Driving the acr");

	}
}

public class LooseCoupling {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
		
	}}
