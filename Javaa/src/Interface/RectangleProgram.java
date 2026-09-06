package Interface;

interface Rectangle {

    void area();
}

class Rectangle1 implements Rectangle {

    public void area() {
        double length = 10;
        double width = 6;
        double area = length * width;
        System.out.println("Area of rectangle = " + area);
    }
}

public class RectangleProgram {

    public static void main(String[] args) {
        new Rectangle1().area();
    }
}
