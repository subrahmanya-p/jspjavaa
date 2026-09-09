package customexceptiom;

class AtmException extends Exception {
	private String message;

	public AtmException(String message) {
		super();
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}

public class Main2 {
	public static void checkPin(int pin) throws AtmException {
		if (pin == 1234) {
			System.out.println("Corretc");
		} else {
			throw new AtmException("Incorrect Pin");
		}

	}

	public static void main(String[] args) {
		try {
			checkPin(354);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}
