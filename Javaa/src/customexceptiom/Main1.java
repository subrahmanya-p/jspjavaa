package customexceptiom;

class BuyException extends Exception {
	String message;

	public BuyException(String message) {
				this.message = message;
	}

	public String getMessage() {
		return message;
	}

}

public class Main1 {
	public static void buy(int quantity) throws BuyException {
		if (quantity >= 1) {
			System.out.println("confirmed");

		} else {
			throw new BuyException("Quantity Should be  greater than 0");
		}

	}

	public static void main(String[] args) {
		try {
			buy(1);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
}
