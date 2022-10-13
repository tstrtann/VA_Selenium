package methods;

public class MethodsSessionTraining {

	public static void main(String[] args) {	
		
		/* METHODS
		 * access modifiers --- static --- void --- nameOfMethod()
		 * 
		 * Access Modifiers, security and scope of the code and access 
		 * 
		 * - Method without argument allows to reuse value
		 * - Method with argument allows you to enter in the parameter set within the method
		 * - Method with a return type will return the data type your set your method as
		 * 
		 * 
		 */
		
		profitOfCompany();
		profitOfCompanyMonthly(16000, 2000, "January");
		profitOfCompanyMonthly(160000, 10, "Feb");
		int profitBeforeTax = profitOfCompanyReturn(1000, 200, "May");
		System.out.println("Profit before tax = " + profitBeforeTax);
		
		
		
//		Calling values from another class
		NonStaticMethods obj = new NonStaticMethods();
		obj.addition(15, 20);
		
		MethodsSessionTraining object = new MethodsSessionTraining();
		object.access();
		
		object.encapsulatedValue();
		object.getPrivateValue();
		
	}

	
	
	public static void profitOfCompany() {
		int comEarned, comExpense, comProfit;
		comEarned = 100000;
		comExpense = 30000;
		comProfit = comEarned - comExpense;
		
		System.out.println("Company profit is " + comProfit);
	}
	
	public static void profitOfCompanyMonthly(int income, int expense, String nameOfMonth) {
		int profit = income - expense;
		System.out.println("Profit of company for the month of " + nameOfMonth + " is " + profit);
	}
	
	public static int profitOfCompanyReturn(int income, int expense, String nameOfMonth) {
		int profit = income - expense;
		System.out.println("Profit of company for the month of " + nameOfMonth + " is " + profit);
		return profit;
	}
	
	public void access() {
		System.out.println("\n\tCalling non static method into main method");
		
	}
	
	
	/*Practice with Encapsulation
	set Method in private*/
	private void encapsulatedValue() {
		System.out.println("This is private method name privateValue");
	}
	// call private method in order to call private method in another class
	public void getPrivateValue() {
		encapsulatedValue();
	}
}
