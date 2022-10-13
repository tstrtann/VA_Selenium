package functionality;

public class LocalGlobalVariable {

	private int a, b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalGlobalVariable o = new LocalGlobalVariable();
		o.setA(1000);
		int getValueA = o.getA();
		System.out.println(getValueA);
		
		o.setB(200);
		int getValueB = o.getB();
		System.out.println(getValueB);
		
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	
	

}
