package collectionss;

import java.util.Arrays;

public class RemoveAll {
	static Object[] arr = { 10, 34, 20, 43, 40 };
	static Object[] objarr = { 10, 20, 30, 40, 50 };

	public static boolean contains(Object obj) {
		for (Object element : arr) {
			if (element != null && element.equals(obj)) {
				return true;
			}

		}
		return false;
	}

	public static void removeAll(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			if (contains(obj[i])) {
				obj[i] = null;

			}
		}

	}

	
	public static void main(String[] args) {
		System.out.println("Before : ");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(objarr));
		removeAll(objarr);
		System.out.println("After : ");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(objarr));
	}
}
