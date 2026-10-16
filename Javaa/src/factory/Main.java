
package factory;

interface PetAnimal {
	void petname();
}

class Cat implements PetAnimal {
	public void petname() {
		System.out.println("meow");
	}
}

class Dog implements PetAnimal {
	public void petname() {
		System.out.println("bow bow");
	}
}

class PetAnimalFactory {
	public static PetAnimal getanimal(String name) {
		if (name.equalsIgnoreCase("cat")) {
			return new Cat();
		} else if (name.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		return null;
	}
}

public class Main {
	public static void main(String[] args) {
		PetAnimal p1 = PetAnimalFactory.getanimal("cat");
		p1.petname();

		PetAnimal p2 = PetAnimalFactory.getanimal("dog");
		p2.petname();
	}
}
