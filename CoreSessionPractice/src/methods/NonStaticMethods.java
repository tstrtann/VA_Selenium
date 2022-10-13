package methods;

public class NonStaticMethods {
	public static void main(String[] args) {
		NonStaticMethods object = new NonStaticMethods();
		
//		object.addition(20, 30);
//		object.profitOfCompanyMonthly(50, 20, "September");
//		object.profitOfCompany();
		object.profitOfCompanyReturn(2312, 231, "June");
		
		MethodsSessionTraining a = new MethodsSessionTraining();
		a.getPrivateValue();
	}
	
	
	public void profitOfCompany() {
		int comEarned, comExpense, comProfit;
		comEarned = 100000;
		comExpense = 30000;
		comProfit = comEarned - comExpense;
		
		System.out.println("Company profit is " + comProfit);
	}
	
	public void profitOfCompanyMonthly(int income, int expense, String nameOfMonth) {
		int profit = income - expense;
		System.out.println("Profit of company for the month of " + nameOfMonth + " is " + profit);
	}
	
	public int profitOfCompanyReturn(int income, int expense, String nameOfMonth) {
		int profit = income - expense;
		System.out.println("Profit of company for the month of " + nameOfMonth + " is " + profit);
		return profit;
	}
	
	public void addition(int a, int b) {
		int addition = a + b;
		System.out.println(a + " + " + b + " = " + addition);
	}
	
	
	// Overriding method in Overriding class,
	public void addition() {
		System.out.println("kotwetkoeo");
		
	}
	
	// Test static method
	
	public static void staticMethod() {
		System.out.println("Test overriding static method");
	}
	
	// CONSTRUCTOR
	
	/*public NonStaticMethods() {
		String name = "Tan";
		int age = 26;
		
		System.out.println("My name is " + name + " and im turning " + age + "\n");
		
	}
	*/

}
