package Abstraction;

abstract class Triangle {

    abstract void findArea();
}

class MyTriangle extends Triangle {

    void findArea() {
        double base = 16.0;
        double height = 7.0;
        System.out.println("The Area of the Triangle is " + 0.5 * base * height);
    }
}

public class TriangleProgram {

    public static void main(String[] args) {
        new MyTriangle().findArea();
    }
}
