import java.util.Scanner;

public class InterestRate{ 
	
	//opening of metthod main to begin executioin of java code
	public static void main(String [] args){
	

	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	//interest = balance * (annualInterst rate/1200)

	System.out.print( "Enter annual interest: "); // prompt
	//Read the first formula
	double annualInterestRate = input.nextDouble();

	System.out.print( "balance "); // prompt
	//Read the first formula
	double balance = input.nextDouble();


	double interest = balance * (annualInterestRate/1200);

	
	
	//display the acceleration
	System.out.println("Balance is:" + interest);


}// ends method main
}// ends class InterestRate.