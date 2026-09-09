package exception;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int b = 100 / 0;
		try {
			System.out.println(90 / 0);

		} catch (ArithmeticException e) {
			System.err.println("Cant devide by Zero");
			// TODO: handle exception
		}

		/// Null Pointer Exception
		///
		try {
			Main n1 = null;
			System.out.println(n1.toString());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Caught an Error");
		}

		// ArrayIndex out of Bound Exception

		try {
			int[] arr = { 2, 4, 5, 6, 6, 5, 4 };
			System.out.println(arr[100]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("Array Error!");
		}
		////
		///
		/// Nested Exeception
		try {
			int v = 100 / 9;
			try {
				int n = Integer.parseInt("76");
				System.out.println(n);

			} catch (NumberFormatException e) {
				System.err.println("Cant convert  it into the Number");
				// TODO: handle exception
			}

		} catch (ArithmeticException e) {
			System.err.println("Cant devide by Zero");
			// TODO: handle exception
		}
		//Number Format Exception

		try {
			int n = Integer.parseInt("hello");

		} catch (NumberFormatException e) {
			System.err.println("Cant convert  it into the Number");
			// TODO: handle exception
		}
	}
}
