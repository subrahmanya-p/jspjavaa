package Interface;

interface Parallelogram {

    void area();
}

class Parallelogram1 implements Parallelogram {

    public void area() {
        double base = 10;
        double height = 6;
        double area = base * height;
        System.out.println("Area of parallelogram = " + area);
    }
}

public class ParallelogramProgram {

    public static void main(String[] args) {
        new Parallelogram1().area();
    }
}
