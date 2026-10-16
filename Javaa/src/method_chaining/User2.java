package method_chaining;

class InstagramDatabase {
	void data() {
		System.out.println("Your  instagram data is ready!");
	}

}

class InstagramServer {
	InstagramDatabase resopnse() {
		InstagramDatabase d1 = new InstagramDatabase();
		return d1;
	}

}

class InstagramClient {
	InstagramServer request() {

		InstagramServer s1 = new InstagramServer();
		return s1;
	}

}

public class User2 {
	public static void main(String[] args) {
		new InstagramClient().request().resopnse().data();
	}

}
