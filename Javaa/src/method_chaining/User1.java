package method_chaining;

class Database {
	void data() {
		System.out.println("Your datas is ready!");
	}

}

class Server {
	Database resopnse() {
		Database d1 = new Database();
		return d1;
	}

}

class Client {
	Server request() {

		Server s1 = new Server();
		return s1;
	}

}

public class User1 {
	public static void main(String[] args) {
		new Client().request().resopnse().data();
	}

}
