
package patterndesign;

public class CarFactoryDesign {

    interface Car {
        void manuafacture();
    }

    static class Swift implements Car {
        public void manuafacture() {
            System.out.println("The Swift is ready");
        }
    }

    static class Arena implements Car {
        public void manuafacture() {
            System.out.println("The Arena is ready");
        }
    }

    static class CarFactory {
        public static Car manuafacture(String name) {
            if (name.equalsIgnoreCase("swift")) {
                return new Swift();
            } else if (name.equalsIgnoreCase("arena")) {
                return new Arena();
            }

          return null;
        }
    }

    public static void main(String[] args) {
        Car c1 = CarFactory.manuafacture("swift");
        c1.manuafacture();
        Car c2= CarFactory.manuafacture("arena");
        c2.manuafacture();

    }
}
