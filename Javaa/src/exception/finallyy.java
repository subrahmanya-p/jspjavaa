package exception;

import java.util.Scanner;

public class finallyy {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter a number :");
		int b = sca.nextInt();// TODO Auto-generated method stub
		try {
			int n = 100 / b;
			System.out.println("Result is :" + n);
		} catch (ArithmeticException e) {
			System.err.println("Can't devide by Zero");
		} finally {
			System.out.println("Program Executed");
		}

	}

}
