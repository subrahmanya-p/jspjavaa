package Interface;

interface Trapezoid {

    void area();
}

class Trapezoid1 implements Trapezoid {

    public void area() {
        double firstParallelSide = 8;
        double secondParallelSide = 12;
        double height = 5;
        double area = 0.5 * (firstParallelSide + secondParallelSide) * height;
        System.out.println("Area of trapezoid = " + area);
    }
}

public class TrapezoidProgram {

    public static void main(String[] args) {
        new Trapezoid1().area();
    }
}
