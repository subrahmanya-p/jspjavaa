package Abstraction;

abstract class Trepezoid {

    abstract void findArea();
}

class MyTrepezoid extends Trepezoid {

    void findArea() {
        double parallelSide1 = 11.0;
        double parallelSide2 = 7.0;
        double height = 5.0;
        System.out.println("The Area of the Trepezoid is " + 0.5 * (parallelSide1 + parallelSide2) * height);
    }
}

public class TrepezoidProgram {

    public static void main(String[] args) {
        new MyTrepezoid().findArea();
    }
}
