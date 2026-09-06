package Encapsulation;

class Database {
	private String data = "Student details";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

public class DatabaseProgram {
	public static void main(String[] args) {
		Database d1 = new Database();
		d1.setData("Employee details");
		System.out.println("Data is: " + d1.getData());
	}
}
