package functionality;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int one, two, three;
		one = 1;
		two = 2;
		three = 3;

		
		
		if(one>two) {
			if(one>three) {
				System.out.println("One is greater ");
			}else {
				System.out.println("Three is bigger");
			}
		}else if(three>two ) {
			System.out.println("Three is the biggest");
		}else if (one==two && one==three && two==three && two==one && three==one && three==two) {
			System.out.println("All equal");
		}else {
			System.out.println("Two is bigger");
		}
		
		
	}

}
