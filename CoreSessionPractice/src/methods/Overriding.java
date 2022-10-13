package methods;


public class Overriding extends NonStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overriding o = new Overriding();
//		o.addition(5, 5);
//		o.additionOverride();
//		o.addition();
		o.profitOfCompany("10/12/22");
		
//		staticMethod();
		
		
	}
	
	
	/*
	 * Using override concept with Inheritance ONLY
	Create same method name from parent class but override the body ONLY
	Can't change the access modifier, switch static/ non static, or void different from parent class
	Body needs to be different from the parent class and must use @Override
	*/
	
	public void additionOverride() {
		// When calling "mult" method in main, the override method is called
		addition();
	}
	
	@Override
	public void addition(int a, int b) {
		
	}
	
	@Override
	public void addition() {
		int add5and5 = 5+5;
		System.out.println(add5and5);
	}
	
	@Override
	public void profitOfCompany() {
		
		System.out.println("profitOfCompany() method is overriden and return this text");
	}
	
	public void profitOfCompany(String date) {
		System.out.println("Date: " + date);
		profitOfCompany();	
	}
	
	
	
	
	
	/* Cannot override method more than once in the same class*/

	
	
	

}
