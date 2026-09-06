package Encapsulation;



class Bank {
	private double balance = 457574.99;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class BankProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Bank b1 = new Bank();
		b1.setBalance(34567890.67);
		System.out.println("The balance is :" + b1.getBalance());

	}

}
