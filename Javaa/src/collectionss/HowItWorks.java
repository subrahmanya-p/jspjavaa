package collectionss;

import java.util.Arrays;

public class HowItWorks {

	static Object[] arr = { 1, 3, 4, 5, 4, 4, 3, 5 };

	static void remove(int index) {
		try {
			arr[index] = null;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	private static void print() {
		System.out.println(Arrays.toString(arr));
	}

	public static void remove(Object obj) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != null && arr[i].equals(obj)) {
				arr[i] = null;
			}
		}
	}

	public static void main(String[] args) {

		print();

		remove(0);
		print();

		remove((Object) 5);
		print();

		remove(4);
		print();
	}
}