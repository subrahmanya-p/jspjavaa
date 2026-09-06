package Runtimepolymorphism;

class Train {
	void travel() {
		System.out.println("travelling coach");
	}
}

class Firstclass extends Train {
	void travel() {
		System.out.println("travelling Firstclass");
	}
}

class sleeper extends Train {
	void travel() {
		System.out.println("travelling in sleeper");
	}
}

class SecondClass extends Train {
	void travel() {
		System.out.println("travelling in SecondClass");
	}
}

class Stimulator3 {
	static void Using(Train t1) {
		t1.travel();

	}
}

public class TrainProgram {

	public static void main(String[] args) {
		Train f1 = new Firstclass();
		Train s1 = new SecondClass();
		Train sl1 = new sleeper();
		Stimulator3.Using(sl1);
		Stimulator3.Using(f1);
		Stimulator3.Using(s1);

	}

}
