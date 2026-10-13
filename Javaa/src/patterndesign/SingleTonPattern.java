package patterndesign;

public class SingleTonPattern {
	private static SingleTonPattern single;

	private SingleTonPattern() {

	}

	public static SingleTonPattern getInstance() {
		if (single == null) {
			single = new SingleTonPattern();
		}
		return single;

	}

	public static void main(String[] args) {
		SingleTonPattern s1;
		s1 = SingleTonPattern.getInstance();
		System.out.println(s1);
		SingleTonPattern s2 = SingleTonPattern.getInstance();
		System.out.println(s2);

	}
}
