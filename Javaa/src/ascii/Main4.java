package ascii;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MeThOd
		// mEtHoD

		String s = "";
		char[] strarr = s.toCharArray();
		int i = 0;

		while (i < strarr.length) {
			if( strarr[i] >= 'A' && strarr[i] <= 'Z') {
				strarr[i] = (char) (strarr[i] + 32);
			}
		else if (strarr[i] >= 'a' && strarr[i] <= 'z') {

				strarr[i] = (char) (strarr[i] - 32);
			}

			i++;

		}
		System.out.println("Here is the new String :" + new String(strarr));

	}
}
