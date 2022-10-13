package exception;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			System.out.println("This is an exception, shouldnt show");
		}
		
		System.out.println("TRY-CATCH!\n");
		
		
		/*
		 * Try and catch allow you to execute code with or without exceptions
		 * it helps identifying the errors at compile time and run executable code
		 * 
		 * Note: if you change "0" to 2, JAVA would not catch any exceptions
		 * 
		 * 
		 */
		
		try {
			int v = 6/2;
			System.out.println("Try:... 'v' is " + v);
		} catch (ArithmeticException e) {
			System.out.println("Catch:... 0 is not divisible");
		} finally {
			System.out.println("Try-catch is complete");
		}

	}

}
