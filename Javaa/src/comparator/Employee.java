package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
	String name;
	int id;
	String email;

	public Employee1(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}
	@Override
	public String toString() {
		return name+" "+id;
	}
}

	class SortByName implements Comparator<Employee1> {
		public int compare(Employee1 e1, Employee1 e2) {
			return e1.name.compareTo(e2.name);

		}
	}
	public class Employee{	

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1("subramua", 121, "subb@gmail.com"));
		list.add(new Employee1("subramua", 121, "subb@gmail.com"));
		list.add(new Employee1("subramua", 121, "subb@gmail.com"));
		list.add(new Employee1("subramua", 121, "subb@gmail.com"));
		Collections.sort(list, new SortByName());
//		for(Employee1 x:list) {
//			System.out.println(x.id);
//		}
		System.out.println(list);

	}
}

