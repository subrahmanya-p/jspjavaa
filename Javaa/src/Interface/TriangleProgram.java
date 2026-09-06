package Interface;

interface Triangle {

    void area();
}

class Triangle1 implements Triangle {

    public void area() {
        double base = 10;
        double height = 6;
        double area = 0.5 * base * height;
        System.out.println("Area of triangle = " + area);
    }
}

public class TriangleProgram {

    public static void main(String[] args) {
        new Triangle1().area();
    }
}


