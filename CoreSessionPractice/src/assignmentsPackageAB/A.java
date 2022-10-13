package assignmentsPackageAB;

public class A {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.multPrivate(20, 2);
		
	}

	
	public void addPublic(int a, int b) {
		int addition = a + b;
		System.out.println(a + " + " + b + " = " + addition);
		
	}
	
	protected void substractProtected(int a, int b) {
		int substraction = a - b;
		System.out.println(a + " - " + b + " = " + substraction);
		
	}
	
	private int multPrivate(int a, int b) {
		int multiplication = a * b;
		System.out.println(a + " x " + b + " = " + multiplication);
		return multiplication;
	}
	
	void divisionDefault(int a, int b) {
		int substraction = a / b;
		System.out.println(a + " / " + b + " = " + substraction);
		
	}

}
