package Encapsulation;

class Amazon {
	private String productName;

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

}

public class AmazonProgram {
	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		a1.setProductName("Mobile phone");
		System.out.println("Product: " + a1.getProductName());
	}
}
