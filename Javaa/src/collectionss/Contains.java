package collectionss;

public class Contains {
	static Object[] arr = { 10, 34, 55, 43, 12, 13, 14, 15 };

 public	static boolean contains(Object obj) {
		for (Object element : arr) {
			if (element != null && element.equals(obj)) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(contains(34));
		// TODO Auto-generated method stub

	}

}
