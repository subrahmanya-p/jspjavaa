package method_chaining;

class AmazonDataBase {
	void product() {
		System.out.println("your product is ready");
	}
}

class DeliverBoy {
	AmazonDataBase delivery() {
		AmazonDataBase a1 = new AmazonDataBase();
		return a1;
	}
}

class Amazon {
	DeliverBoy order() {
		DeliverBoy d1 = new DeliverBoy();
		return d1;
	}
}

public class User3 {
	public static void main(String[] args) {

		new Amazon().order().delivery().product();
	}

}
