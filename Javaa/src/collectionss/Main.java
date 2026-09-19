package collectionss;

public class Main {
	static Object[] arr = new Object[10];

	public static int size() {
		int count = 0;
		for (Object i : arr) {
			if (i != null)
				count++;

		}
		return count;

	}

	public static void main(String[] args) {
		arr[0] = 60;
	}

}
