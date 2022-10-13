package assignmentsPractice;

public class Animal {
	
	/*
	 * 1. How to create a method?
	 * - declare method with access modifier
	 * - declare if method is static or non static
	 * - declare if method will return value or not
	 */
	
	 /* 2. Method keywords:
	 * - access modifier, allow java to connect and access many classes to packages and packages to projects
	 * - void, method doesn't return any value
	 * - static or non static, if it accessible with instance of the class. Non-static method can be called by
	 * creating object of the class 
	 */
	
	public Animal() {
		System.out.println("\t\tDifferent Types of Animal\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.dog();
		animal.nameAnAnimal("cat");
		animal.nameAnotherAnimal("parrot");
	}
	
	public void dog() {
		System.out.println("This is a dog");
	}
	
	public void nameAnAnimal(String nameAnimal) {
		System.out.println("This is a " + nameAnimal);
	}
	
	public String nameAnotherAnimal(String nameAnimal) {
		System.out.println("This is an " + nameAnimal);
		return nameAnimal;
	}

}
