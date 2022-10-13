package abstraction;



abstract class Bird {
	public void sing() {
		System.out.println("Bird is singing");
	}
	
	public void eat() {}
	public void fly() {}
	
	
}

class Crow extends Bird {
	public void sing() {
		System.out.println("Crow is cawling");
	}
	
	public void eat() {
		System.out.println("Crow is eating");
	}
	
	
}

public abstract class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Crow crow = new Crow();
		crow.eat();
		crow.sing();
		

	}

}
