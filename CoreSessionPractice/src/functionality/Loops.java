package functionality;

public class Loops {

	static int k = 101;

	public static void main(String[] args) {
		
		 /* While Loop */
		
//		while(k<10) {
//			System.out.println("Automation " + k);
//			k++;
//		}
		 
		/*---------------------------------------------------------*/		
		
		 /* Do-While Loop*/
		
//		do {
//			System.out.println("Count: "+ --k);
//		}
//		while(k!=101);
		
		
		/*---------------------------------------------------------*/
		
//		for (int i=0; i<=1000; i++) {
//			System.out.println("Count " + i);
//		}
		 
		
		/*---------------------------------------------------------*/
		
		/* Nested For-Loop */
		
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute <=60; minute++) {
				for (int seconds = 0; seconds <=60; seconds++) {
					System.out.println(hour + ":HR "+ minute + ":MIN " + seconds + ":SEC");
				}
			}
		}		 

	}

}
