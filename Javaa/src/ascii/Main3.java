package ascii;

public class Main3 {

	public static void main(String[] args) {
		// jaVa
		// JAva
		String s = "jaVA";
		char[] strarr = s.toCharArray();
		int i = 0;
		int j = strarr.length - 1;

		while (i < j) {
			strarr[i] = (char) (strarr[i] - 32);
			strarr[j] = (char) (strarr[j] + 32);
			i++;
			j--;

		}
		System.out.println("Here is the new String :" + new String(strarr));
	}

}
