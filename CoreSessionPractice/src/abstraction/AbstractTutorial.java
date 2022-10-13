package abstraction;


/*
 *  Interface class will assume ALL methods are abstract, NO BODY!
 *  must use "implement" keyword to tied together  
 */

interface DogInterface {
	void eat();
	void whine();
	void playing();
	void drinking();
	
	/*
	 * Will not allow because interface have NO body

	public void laying() {
	}

	 */
	
}

/*
 * Abstract class allows to create template method to override and use differently
 * under Abstract class, we can have implemented method and abstract methods together
 * 
 * Abstract class needs to be called in a class before calling its object to print 
 * 
 */

abstract class Dog {
	

	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
	
	public abstract void run();	
	
	public abstract void whine(String w);
	
}


/*
 * A class needs to be created in order to either "extends" or "implements" 
 * an abstract methods using its own class 
 * 
 * Can leave uncalled methods and still execute
 * 
 * MUST DECLARE BODY 
 * 
 */

class Chihuahua extends Dog {
	public void poop()	{
		System.out.println("Dog pooped!");
	}

	public void run() {
		System.out.println("Dog is running!");
	}
	
	public void talk() {
		System.out.println("Dog is talking");
	}	
	
	public void whine(String w)	{
		System.out.println(w);
		
	}
}





/*
 * MUST DECLARE BODY
 * 
 * MUST call ALL Interface methods for interface class to execute
 * 
 * Doesnt need to declare body
 */

class Pitbull implements DogInterface {
	public void eat() {
		System.out.println("Dog is eating...");

	}
	
	public void whine() {
		System.out.println("Dog is whinning...");
	}
	
	public void drinking() {
		System.out.println("Dog is drinking...");
	}
	
	public void playing() {
		
	}
	
	public void sit() {
		
	}

	public void sleeping() {
		
	}
}





public abstract class AbstractTutorial {
	
	public static void main(String[] args) {

		//Chihuahua is an abstract class 
		Chihuahua chi = new Chihuahua();
		chi.bark();
		chi.run();
		chi.whine("Chihuahua whinning");
		
		System.out.println("-------------------");
		
		
		//Pitbull is an interface class
		Pitbull pit = new Pitbull();
		pit.eat();
		pit.whine();
		pit.drinking();
		pit.sit();
				
	}
}