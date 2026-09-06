package Interface;

interface Square {

    void area();
}

class Square1 implements Square {

    public void area() {
        double side = 5;
        double area = side * side;
        System.out.println("Area of square = " + area);
    }
}

public class SquareProgram {

    public static void main(String[] args) {
        new Square1().area();
    }
}
