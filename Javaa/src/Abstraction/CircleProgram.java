package Abstraction;

abstract class Circle {

    abstract void findArea();
}

class MyCirlcle extends Circle {

    void findArea() {
        double r = 34.5;
        System.out.println("The Area of  the Circle is " + Math.PI * r * r);
    }
}

public class CircleProgram {

    public static void main(String[] args) {
        new MyCirlcle().findArea();

    }

}
