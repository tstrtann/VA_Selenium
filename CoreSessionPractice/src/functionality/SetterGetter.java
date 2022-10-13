package functionality;

public class SetterGetter {

	private String a, b;
	
	
	// Getter methods
	public String getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
	
	// Setter methods
	public void setA(String a) {
		this.a = a;
	}
	
	public void setB(String b) {
		this.b = b;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetterGetter sg = new SetterGetter();
		
		sg.setA("This string belongs to a");
		String A = sg.getA();
	
		
		sg.setB("This string belongs to b");
		String B = sg.getB();

		
		//***RANDOM LOOP TEST***
		for(int i=0; i<3; i++) {
			System.out.println(A + "\t\t\t" + B);
		}
	}

}
