package coupling;

interface Engine2 {
	void start();
}
 class PetrolEngine implements Engine2{

	@Override
	public void start() {
		System.out.println("petrol engine");
	}
	 
 }
  class DieselEngine implements Engine2{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println(" DieselEngine engine");
	}
	  
  }

class Car1 {
	Engine2 engine;

	public Car1(Engine2 engine) {
		this.engine = engine;
	}

	void drive() {
		engine.start();

		System.out.println("Driving the acr");

	}
}

public class TightCoupling {
	public static void main(String[] args) {
		
		Engine2 e1 = new DieselEngine();
		Car1 c1 = new Car1(e1);
		c1.drive();

	}
}
