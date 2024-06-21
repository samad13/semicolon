import java.util.Scanner;

public class DoWhile{ 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	
	
	do{
	System.out.println("enter  first number ");
	int number1 = input.nextInt();
	if(number1 == -1)
	break;
	System.out.println("enter  second number ");
	int number2 = input.nextInt();
	if(number2 == -1)
	break;
	int result = number1 + number2;

	System.out.println("result "+ result);
	
	input.nextLine();

	
	
		
	}while ( true);

	System.out.println("progarms terminate");
	 

}
}
