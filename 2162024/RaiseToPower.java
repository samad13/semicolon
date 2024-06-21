import java.util.Scanner;


public class RaiseToPower{
	public static void main(String[]args){

	
	Scanner input = new Scanner(System.in);	

	System.out.println("Enter  first number : ");
     	int number1 = input.nextInt();
	
	System.out.println("Enter  second number number that will be raise to the power of the first : ");
     	int number2 = input.nextInt();
	int numberRaise = number2;

	

	int count = 1;
	while (numberRaise !=0) { 
	count +=1;
	numberRaise -- ; 
				}
	int answer = number1 * count;
System.out.println("the result of " + number1 + " raise to the power of " + number2 + " is " + answer); 










}




}