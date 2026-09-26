package collectionss;

import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();

		set.add(10);
		set.add(20);
		set.add(60);
		set.add(50);
		set.add(30);
		set.add(20);

		System.out.println(set);
		System.out.println("The Size of the set : " + set.size());
		System.out.println("Is 50 present ? " + set.contains(50));

		set.remove(10);
		System.out.println("After Removing 10 : " + set);

		System.out.println("Is the set empty ? " + set.isEmpty());

		LinkedHashSet set2 = new LinkedHashSet();

		set2.add(100);
		set2.add(200);

		set2.addAll(set);
		System.out.println("After Adding set to set2 : " + set2);

		set2.removeAll(set);
		System.out.println("After Removing set values from set2 : " + set2);

		set2.add(20);
		set2.add(60);
		set2.add(100);

		set2.retainAll(set);
		System.out.println("After Retaining common values : " + set2);

		System.out.println("Does set2 contain all values of set ? "
				+ set2.containsAll(set));

		set.clear();
		System.out.println("After Clearing the set : " + set);
	}
}