package Abstraction;

abstract class Rectangle {

	abstract void findArea();
}

class MyRectangle extends Rectangle {

	void findArea() {
		double length = 15.0;
		double breadth = 8.0;
		System.out.println("The Area of the Rectangle is " + length * breadth);
	}
}

public class RectangleProgram {

	public static void main(String[] args) {
		new MyRectangle().findArea();
	}
}
