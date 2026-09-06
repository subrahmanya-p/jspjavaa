package ascii;

//import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class Main2 {

	public static void main(String[] args) {
		// hello
		// HlleO

		String str = "subrahmnyaaaa";
		System.out.println("Original String:" + str);
		char first = (char) (str.charAt(0) - 32);
		char last = (char) (str.charAt(str.length() - 1) - 32);
		String middleString = "";
		for (int i = str.substring(1, str.length() - 1).length(); i >= 1; i--) {
			middleString += str.charAt(i);

		}
		System.out.println("Final result:" + (first + middleString + last));

	}

}
