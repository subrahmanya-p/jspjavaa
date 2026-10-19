package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
	String name;
	public Student1(String name) {
		this.name = name;
	}
}

class SortByName2 implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.name.length() - s2.name.length();
	}
}


public class Main1 {
	public static void main(String[] args) {
		List<Student1> l1 = new ArrayList<>();

		l1.add(new Student1("Subbu"));
		l1.add(new Student1("Ram"));
		l1.add(new Student1("Krishna"));
		l1.add(new Student1("Anu"));
		l1.add(new Student1("Subrahmnyaaa"));

		Collections.sort(l1, new SortByName2());

		for (Student1  s : l1) {
			System.out.println(s.name);
		}
	}

}
