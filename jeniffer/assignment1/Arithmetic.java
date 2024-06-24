import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("input firt integer: ");
	int firstNumber = input.nextInt();

	System.out.print("input second integer: ");
	int secondNumber = input.nextInt();

	int firstNumberSquared = (firstNumber * firstNumber);
	int secondNumberSquared = (secondNumber * secondNumber);

	int addition = firstNumberSquared + secondNumberSquared;
	int minus = firstNumberSquared - secondNumberSquared;
	
	System.out.printf("The sum is " + addition  + " and the difference " + minus  );

	}
}

