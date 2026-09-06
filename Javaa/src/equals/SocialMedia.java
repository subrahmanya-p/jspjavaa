package equals;

public class SocialMedia {
	String name;

	public SocialMedia(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		SocialMedia c1 = (SocialMedia) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		SocialMedia c1 = new SocialMedia("Instagram");
		SocialMedia c2 = new SocialMedia("Instagram");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
