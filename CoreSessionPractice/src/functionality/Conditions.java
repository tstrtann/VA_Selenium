package functionality;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean truth = 5<1;
		if (truth == false) {
			System.out.println("Statement is false");
		} else {
			System.out.println("State is true");
		} 
		
		System.out.println("\n---------\n");
		
		Conditions c = new Conditions();
		c.trueTest();
		
		
		
	}
	
	
	public void trueTest() {
		boolean i = 5>5;
		if(i == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
