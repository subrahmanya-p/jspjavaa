package method_chaining;

class Food {
    void eat() {
        System.out.println("Enjoy your food!");
    }
}

class DeliveryBoy {
    Food deliver() {
        Food f1 = new Food();
        return f1;
    }
}

class Restaurant {
    DeliveryBoy order() {
        DeliveryBoy d1 = new DeliveryBoy();
        return d1;
    }
}

public class User4 {
    public static void main(String[] args) {
        new Restaurant().order().deliver().eat();
    }
}