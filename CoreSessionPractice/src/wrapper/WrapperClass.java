package wrapper;

public class WrapperClass {

	/*
	 * Every primitive Data Types have their own Wrapper Class
	 * short 	- Short
	 * int 		- Integer
	 * long 	- Long
	 * float 	- Float
	 * double 	- Double
	 * char 	- Character
	 * byte 	- Byte
	 * boolean 	- Boolean
	 * 
	 */
	
	/*
	 * What are Wrapper Classes? 
	 * - every primitive Data Types has its own wrapper class
	 * - we use wrapper class to convert into object form
	 * 
	 * There are 2 types of Wrapper Classes:
	 * 		- Boxing, creating object for wrapper class
	 * 		- Auto-boxing, declaring object to wrapper class
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInt();
	}
	
	public static void getInt() {
		int i = 100;
//		Integer one = new Integer(i); 	// Boxing: converting variable value into object form
//		System.out.println(one);
		Integer one = i; 				// Auto-boxing: auto converting into object form 
		System.out.println(one);
		
//		System.out.println("The wrapper class of 'int i' is " + one);
	}
}
