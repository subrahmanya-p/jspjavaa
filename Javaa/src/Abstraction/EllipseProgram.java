package Abstraction;

abstract class Ellipse {

    abstract void findArea();
}

class MyEllipse extends Ellipse {

    void findArea() {
        double semiMajorAxis = 10.0;
        double semiMinorAxis = 6.0;
        System.out.println("The Area of the Ellipse is " + Math.PI * semiMajorAxis * semiMinorAxis);
    }
}

public class EllipseProgram {

    public static void main(String[] args) {
        new MyEllipse().findArea();
    }
}
