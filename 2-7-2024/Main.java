import java.util.Scanner;
public class Main{
		
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number for fucntion to check: ");
		int pick = input.nextInt();

		switch(pick){
		case 1:
		System.out.print("Enter number to return true if even or false if not : ");
		int number = input.nextInt();
		System.out.println(Kata.isEvenBoolean(number));
		break;

		case 2:
		System.out.print("Enter number to return true if it a prime or not: ");
		 number = input.nextInt();
		System.out.println(Kata.isPrimeNumber(number));
		break;

		case 3:
		System.out.println("Enter 2 number that substract each other and always return positive nunmber: ");
		int number1 = input.nextInt();
		int  number2 = input.nextInt();
		System.out.println(Kata.positiveDifferece(number1, number2));
		break;
	
		case 4:
		System.out.println("Enter 2 number that divide each other and return qoutient decimal 2  : ");
		number1 = input.nextInt();
	        number2 = input.nextInt();
		//System.out.printf("%.2f",  answer);
		System.out.println(Kata.qoutientDivide(number1, number2));
		break;
	
		case 5 :
		System.out.println("put  NUMBER: ");
		number = input.nextInt();
		System.out.println(Kata.factor(number));
		break;

		case 7:
		System.out.print("input  5 digit integer: ");
		number = input.nextInt();
		while (number < 10000 || number > 99999){
		System.out.print("error retype, put only (5) five number: ");
		number = input.nextInt();	
		}
		System.out.println(Kata.palindrome(number));
		break;

		
		
	}	

	}

}