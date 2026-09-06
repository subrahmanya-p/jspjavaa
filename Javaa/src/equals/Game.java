package equals;

public class Game {
	String name;

	public Game(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Game c1 = (Game) obj;
		return c1.name == this.name;
	}

	public static void main(String[] args) {
		Game c1 = new Game("Cricket");
		Game c2 = new Game("Football");
		if (c1.equals(c2)) {
			System.out.println("Same Same");
		} else {
			System.out.println("Different");
		}
	}
}
