package object;

public class Teacher {
	String name;
	String sub;
	double salary;

	Teacher(String name, String sub, double salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.sub = sub;

	}

	public String toString() {
		return this.name + " " + this.sub + " " + this.salary;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("Shubha", "English", 34000);
		System.out.print(t1);

	}

}
