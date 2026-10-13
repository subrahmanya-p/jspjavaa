package superr;

class Brand {
	public Brand(String brand) {
		System.out.println(" Brand is " + brand);
	}

}

class Car extends Brand {
	public Car(String car, String brand) {
		super(brand);
		System.out.println("Car is" + car);

	}
}

public class Main2 {
	public static void main(String[] args) {
		 new Car("Fortuner", "Toyata");

	}
}
