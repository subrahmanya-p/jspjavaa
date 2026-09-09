package customexceptiom;

;

class AgeValidationExeception extends Exception {

//	AgeValidationExeception(String msg) {
//		super(msg);
//	}

	String message;

	AgeValidationExeception(String message) {
		this.message = message;

	}
	public String getMessage() {
		 return this.message;
		
	}

}

public class Main {
	public static void validateAge(int age) throws AgeValidationExeception {

		if (age >= 18) {
			System.out.println(" valid age");
		} else {
			throw new AgeValidationExeception("Age should be greater than 18");
		}
	}

	public static void main(String[] args) {
	
		
		try {
			validateAge(8);
		} catch (AgeValidationExeception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
}
