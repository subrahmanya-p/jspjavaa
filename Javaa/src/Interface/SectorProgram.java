package Interface;

interface Sector {

    void area();
}

class Sector1 implements Sector {

    public void area() {
        double radius = 7;
        double angleInDegrees = 90;
        double area = (angleInDegrees / 360) * Math.PI * radius * radius;
        System.out.println("Area of sector = " + area);
    }
}

public class SectorProgram {

    public static void main(String[] args) {
        new Sector1().area();
    }
}
