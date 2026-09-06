package Abstraction;

abstract class Sector {

    abstract void findArea();
}

class MySector extends Sector {

    void findArea() {
        double radius = 9.0;
        double angleInDegrees = 60.0;
        System.out.println("The Area of the Sector is " + (angleInDegrees / 360.0) * Math.PI * radius * radius);
    }
}

public class SectorProgram {

    public static void main(String[] args) {
        new MySector().findArea();
    }
}
