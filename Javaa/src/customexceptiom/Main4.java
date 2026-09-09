package customexceptiom;

class GooglePayException extends Exception {
	private String message;

	public GooglePayException(String message) {

		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}

public class Main4 {
	public static void checkBalance(int pin) throws GooglePayException {
		if (pin == 3456) {
			System.out.println("Balance is " + 6000);
		} else {
			throw new GooglePayException("incorrect Pin");
		}

	}

	public static void main(String[] args) {
		try {
			checkBalance(3456);
		} catch (GooglePayException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
}
