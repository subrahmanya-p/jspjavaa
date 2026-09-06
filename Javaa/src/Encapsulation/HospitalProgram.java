package Encapsulation;

class Hospital {
	private String patientName;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
}

public class HospitalProgram {
	public static void main(String[] args) {
		Hospital h1 = new Hospital();
		h1.setPatientName("Ravi");
		System.out.println("Patient name: " + h1.getPatientName());
	}
}
