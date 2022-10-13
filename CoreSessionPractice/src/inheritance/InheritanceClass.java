package inheritance;


// Default Animal class
class Animal {
	public void animalSound() {
		System.out.println("Animal makes a sounds");
	}
}


// Default Dog class
class Dog extends Animal {
	public void animalSound() {
		System.out.println("Dog is barking!");
	}
}


// Default Cat class
class Cat extends Animal {
	public void animalSound() {
		System.out.println("Cat is moewing!");
	}
}



// Main class
public class InheritanceClass {
	public static void main (String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		a.animalSound();
		d.animalSound();
		c.animalSound();
		
	}

}
