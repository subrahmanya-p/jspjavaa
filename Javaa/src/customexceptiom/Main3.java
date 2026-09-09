package customexceptiom;

class PasswordException extends Exception {

	String message;

	PasswordException(String message) {
		this.message = message;

	}

	public String getMessage() {
		return this.message;

	}

}

public class Main3 {
	public static void checkPass(String password) throws PasswordException {
		if (password.equals("Subrahmnya@098")) {
			System.out.println("Succesfull");
		} else {
			throw new PasswordException("Incorrect Password");
		}

	}

	public static void main(String[] args) {
		try {
			checkPass("Subbu@098??");
		} catch (PasswordException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
