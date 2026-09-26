package collectionss;

import java.util.HashSet;

public class HashSetExampleee {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(15);
		h1.add(10);
		h1.add(12);
		h1.add(67);
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		System.out.println();
		System.out.println(h1.contains(12));
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
	}
}
