package Encapsulation;

class InstagramServer {
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login(String enteredEmail, String enteredPassword) {
		if (email.equals(enteredEmail) && password.equals(enteredPassword)) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Invalid email or password.");
		}
	}
}

public class InstagramServerProgram {
	public static void main(String[] args) {
		InstagramServer i1 = new InstagramServer();
		i1.setEmail("student@gmail.com");
		i1.setPassword("insta123");
		i1.login("student@gmail.com", "insta123");
	}
}
