package Encapsulation;

class StudentResult {
	private int regNo;
	private double marks;

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}

public class StudentResultProgram {
	public static void main(String[] args) {
		StudentResult s1 = new StudentResult();
		s1.setRegNo(101);
		s1.setMarks(85.5);
		System.out.println("Register number: " + s1.getRegNo());
		System.out.println("Marks: " + s1.getMarks());
	}
}
