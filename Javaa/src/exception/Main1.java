package exception;

public class Main1 {
	public static void main(String[] args) {
		try {
			int a = 100 / 8;
			System.out.println("Result is :" + a);
		} finally {
			System.out.println("Program Executed");
		}
	}

}
