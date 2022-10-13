package functionality;

public class Arrays {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits = new String[5];
		fruits[0] = "Banana";
		fruits[1] = "Kiwi";
		fruits[2] = "Strawbery";
		fruits[3] = "Melon";
		fruits[4] = "Blueberry";
		
		

		/*
		for (int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		 */
		
		
		
		for (String i:fruits) {
			System.out.println(i);
		}
		
		System.out.println("\n------------------\n");
		
		
		numArray();
		
		System.out.println("\n------------------\n");
		
		twoDArray();
		 
		

	}

	
	public static void numArray() {
		int [] num = new int[5];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		System.out.println("The length of this array is " + num.length);
		System.out.println("Storage number for num[4] is = " + num[4] + "\n");
		
		for(int i : num) {
			System.out.println(i);
		}
	}
	
	public static void twoDArray() {
		int rows 	= 5;
		int columns = 5;
		
		
		int[][] monthYear = new int[rows][columns];
		
		System.out.println("The size of this 2D array is " + monthYear.length);

	}
}
