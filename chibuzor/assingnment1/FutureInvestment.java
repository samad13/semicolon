import java.util.Scanner;

public class FutureInvestment{ 
	
	//opening of metthod main to begin executioin of java code
	public static void main(String [] args){
	

	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	

	System.out.print( "Enter investment amount: "); // prompt
	//Read investment amount from user
	double investmentAmount = input.nextDouble();

	System.out.print( "annual interest rate: "); // prompt
	//Read annualInterestRate amount from user
	double annualInterestRate = input.nextDouble();

	System.out.print( "Enter number of years: "); // prompt
	//Read number of years from user
	double numberOfYears = input.nextDouble();
	
	//Multiply nunmber of years with 12
	double numbers = numberOfYears * 12;
	
	//divide annual inetrest rate by 100 to get monthly inetest rate
 	double monthlyInterestRate = annualInterestRate / 100 ;

	// try rhis first double result  =Math.pow(1 + monthlyInterestRate, numbers)
	// investmentAmount * result
	double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numbers);
	
	//display the acceleration
	System.out.println("Accumulated value is:" + futureInvestmentValue);


}// ends method main
}// ends class FutureInvestment.