package thiss;

public class Employee {

	String name;
	int age;
	double salary;

	public Employee(String name) {
		this(name, 18);

	}

	public Employee(String name, int age) {
		this(name, age, 45000);

	}

	public Employee(String name, int age, double salary) {
		this.salary = salary;
		this.name = name;
		this.age = age;

	}
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	

	public static void main(String[] args) {
	 Employee e1 = new Employee("subbu");
	 Employee e2 = new Employee("subbu", 21);
	 Employee e3 = new Employee("subbu", 19,4500.0);
	 System.out.println(e1.toString());
	 System.out.println(e2.toString());
	 System.out.println(e3.toString());
	 

	}




}
