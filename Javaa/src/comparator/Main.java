package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class  Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
  }

	class SortByName1 implements Comparator<Student> {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	} 
	public  class  Main{

		public static void main(String[] args) {
			List<Student> l1 = new ArrayList<>();

			l1.add(new Student("Subbu"));
			l1.add(new Student("Ram"));
			l1.add(new Student("Krishna"));
			l1.add(new Student("Anu"));

			Collections.sort(l1, new SortByName1());

			for (Student s : l1) {
				System.out.println(s);
			}
		}
	 }
