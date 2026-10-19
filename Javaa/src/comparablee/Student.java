package comparablee;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	int id;

	public Student(int id) {

		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	public int compareTo(Student s) {
		return this.id - s.id;

	}

	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<Student>();
		l1.add(new Student(101));
		l1.add(new Student(103));
		l1.add(new Student(105));
		l1.add(new Student(108));
		l1.add(new Student(109));
		Collections.sort(l1);
		for (Student student : l1) {
			System.out.println(student);
		}
	}
}
