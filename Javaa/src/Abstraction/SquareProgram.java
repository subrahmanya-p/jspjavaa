package Abstraction;

abstract class Square {

    abstract void findArea();
}

class MySquare extends Square {

    void findArea() {
        double side = 12.0;
        System.out.println("The Area of the Square is " + side * side);
    }
}

public class SquareProgram {

    public static void main(String[] args) {
        new MySquare().findArea();
    }
}
