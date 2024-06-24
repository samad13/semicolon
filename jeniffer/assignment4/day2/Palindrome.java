import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
			
	System.out.print("put five number: ");
	int number = input.nextInt();

	while (number < 10000 || number > 99999){
	System.out.print("error retype, put only (5) five number olodo: ");
	number = input.nextInt();
	}
	
	int value1 = number / 1000;
	int value2 = value1 / 10;
	int value3 = value1 % 10;
	int value4 = number % 100;
	int value5 = value4 % 10;
	int value6 = value4 / 10;

	if(value2 == value5 && value3 == value6){
	System.out.println(number + " is a palindrome");
	}else{
	System.out.println(number + " is not a palindrome");	
	}

	

	
	
}

}