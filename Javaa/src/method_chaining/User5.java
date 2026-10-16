package method_chaining;

class Receipt {
    void generate() {
        System.out.println("Payment successful. Receipt generated!");
    }
}

class Payment {
    Receipt pay() {
        Receipt r1 = new Receipt();
        return r1;
    }
}

class Shopping {
    Payment checkout() {
        Payment p1 = new Payment();
        return p1;
    }
}

public class User5 {
    public static void main(String[] args) {
        new Shopping().checkout().pay().generate();
    }
}