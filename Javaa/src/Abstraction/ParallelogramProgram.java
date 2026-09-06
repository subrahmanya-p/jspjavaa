package Abstraction;

abstract class Parallelogram {

	abstract void findArea();
}

class MyParallelogram extends Parallelogram {

	void findArea() {
		double base = 14.0;
		double height = 9.0;
		System.out.println("The Area of the Parallelogram is " + base * height);
	}
}

public class ParallelogramProgram {

	public static void main(String[] args) {
		new MyParallelogram().findArea();
	}
}
