/* this is my project to compute the remainders of keyboard inputs.
*@Author Ben Cruickshank
*@version 1.0
*
*/
public class Project2 {
public static void main(String args[]) {
	int copiesOfBook1 = 2; 
	int copiesOfBook2 = 4;
	int copiesOfBook3 = 1;
	
	String book1 = " Three Sisters, Bi Feiyu";
	String book2 = " Song of Solomon, Toni Morrison";
	String book3 = " Owls Don't Have to Mean Death, Chip Livingston";
	
	double costBook1 = 18.99;
	double costBook2 = 11.99; 
	double costBook3 = 80.50;
	
	double beforeTax = copiesOfBook1 * costBook1 + copiesOfBook2 * costBook2 + copiesOfBook3 * costBook3;
	
	final double TAX_PERCENT = 0.0875;
	double salesTax = beforeTax * TAX_PERCENT;
	double finalTotal = salesTax + beforeTax; 
	System.out.println("Purchase " + copiesOfBook1 + " copies of" + book1 + ". Each copy costs $" + costBook1 + ".");
	System.out.println("Purchase " + copiesOfBook2 + " copies of" + book2 + ". Each copy costs $" + costBook2 + ".");
	System.out.println("Purchase " + copiesOfBook3 + " copy of" + book3 + ". Each copy costs $" + costBook3 + "0.");
	System.out.println("Total before tax: $" + beforeTax);
	System.out.println("Sales tax: $" + String.format("%.2f", salesTax));
	System.out.println("The total cost of your order will be $" + String.format("%.2f", finalTotal));
	
	
	
	
	
}
}
