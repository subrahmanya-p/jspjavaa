package generics;

import java.util.ArrayList;

public class Employee {
	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	

	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		ArrayList<Employee> e1= new ArrayList<Employee>();
		e1.add(new Employee("Subbu", 20));
		e1.add(new Employee("mahi", 19));
		for (Employee employee : e1) {
			System.out.println(employee);
			
		}

	}

}
