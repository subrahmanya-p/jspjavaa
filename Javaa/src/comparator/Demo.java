package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student4 {
	int mark;

	public Student4(int mark) {

		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + "]";
	}

}

class SortByMark implements Comparator<Student4> {
	public int compare(Student4 s1, Student4 s2) {
		if (s1.mark < s2.mark) {
			return 1;

		} else if (s1.mark > s2.mark) {
			return -1;

		} else {
			return 0;
		}
	}
}

public class Demo {

	public static void main(String[] args) {

		List<Student4> l1 = new ArrayList<Student4>();
		l1.add(new Student4(45));
		l1.add(new Student4(4));
		l1.add(new Student4(465));
		l1.add(new Student4(466));
		l1.add(new Student4(0));
		l1.add(new Student4(15));
		l1.add(new Student4(-45));
		Collections.sort(l1, new SortByMark());
		for (Student4 student : l1) {
			System.out.println(student);

		}

	}
}
