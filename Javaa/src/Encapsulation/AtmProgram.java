package Encapsulation;

class Atm {
	private int pin = 1234;
	private double balance = 5000.0;

	public void setBalance(int enteredPin, double balance) {
		if (enteredPin == pin) {
			this.balance = balance;
			System.out.println("Balance updated successfully.");
		} else {
			System.out.println("Incorrect PIN.");
		}
	}

	public void getBalance(int enteredPin) {
		if (enteredPin == pin) {
			System.out.println("Balance is: " + balance);
		} else {
			System.out.println("Incorrect PIN.");
		}
	}
}

public class AtmProgram {
	public static void main(String[] args) {
		Atm a1 = new Atm();
		a1.getBalance(1274);
		a1.setBalance(1274, 8000.0);
		a1.getBalance(1534);
	}
}
