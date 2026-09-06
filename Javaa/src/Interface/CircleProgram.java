package Interface;

interface Circle {

	void area();
}

class Circle1 implements Circle {

	public void area() {
		double radius = 7;
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle = " + area);
	}
}

public class CircleProgram {

	public static void main(String[] args) {
		new Circle1().area();

	}
}
