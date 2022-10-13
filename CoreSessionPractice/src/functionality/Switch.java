package functionality;

public class Switch {
	
	public static void main(String args[]) {
		
		int names = 1;
		
		switch (names) {
		
			case 1: 
				System.out.println("Charles");
				break;
		
			case 2:
				System.out.println("Polase");
				break;
				
			case 3:
				System.out.println("Keytti");
				break;
		
			case 4:
				System.out.println("Binz");
				break;
						
			case 5:
				System.out.println("Tan");
				break;
				
		}		
		
		switching();
	}
	
	public static void switching() {
		int i = 3;
		switch (i) {
			case 1:
				System.out.println("One");
				break;
				
			case 2:
				System.out.println("Two");
				break;
			
			case 3:
				System.out.println("Three");
				break;
		}
	}
}
