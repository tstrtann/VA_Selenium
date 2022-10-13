package functionality;

public class IncrementalDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Post Incremental
		int s = 6;
//		s++;
//		System.out.println("Increment of 's' is: " + s);
//		s--;
//		System.out.println("Decrement of 's' is: " + s);
//		
//		System.out.println();
		
		//Pre Incremental
		int k = ++s;
		System.out.println("s = " + s);
		System.out.println("k = " + k);
	}

}
