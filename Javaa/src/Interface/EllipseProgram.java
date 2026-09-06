package Interface;

interface Ellipse {

    void area();
}

class Ellipse1 implements Ellipse {

    public void area() {
        double semiMajorAxis = 8;
        double semiMinorAxis = 4;
        double area = Math.PI * semiMajorAxis * semiMinorAxis;
        System.out.println("Area of ellipse = " + area);
    }
}

public class EllipseProgram {

    public static void main(String[] args) {
        new Ellipse1().area();
    }
}
