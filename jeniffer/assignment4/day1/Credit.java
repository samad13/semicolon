import java.util.Scanner; 
	public class Credit {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("How many customer do you want to check: ");
	int customer = input.nextInt();
	
	if (customer < 1){
	System.out.print("invalid number of customer so this program will exit now: ");
	System.exit(0);
	}
	
	while (customer >= 1) {

	System.out.print("Input account Number: ");
	int accountNumber = input.nextInt();
	
	System.out.print("Input credit limit: ");
	int creditLimit = input.nextInt();

	System.out.print("balance at the beggining of the month: ");
	int balance = input.nextInt();

	System.out.print("Charged items per month: ");
	int ChargedPerMonth = input.nextInt();

	System.out.print("Input  credits applied for this month: ");
	int creditApplied = input.nextInt();

	int newBalance = (balance + ChargedPerMonth) - creditApplied;

	System.out.println( "This is your new $"+ newBalance);

	      if(newBalance > creditLimit ){
		System.out.println("Credit limit exceeded");
	     }else{	
		int availableCredit = creditLimit - newBalance;
		System.out.println("you can still borrow $"+ availableCredit);
		}
	
	   customer --;
	

	 }
	System.out.print("The above are the list of customers credit worthines");
}
	
}















