
import java.util.Scanner;
public class FiveIntegers{
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int highest = 0;
	int lowest = 0;

	System.out.print("input firt integer: ");
	int firstNumber = input.nextInt();

	System.out.print("input second integer: ");
	int secondNumber = input.nextInt();
	
	System.out.print("input third integer: ");
	int thirdNumber = input.nextInt();

	System.out.print("input third integer: ");
	int fourthNumber = input.nextInt();

	System.out.print("input third integer: ");
	int fifthNumber = input.nextInt();
	
	


	if (firstNumber >= secondNumber && firstNumber >= thirdNumber && firstNumber >= fourthNumber && firstNumber >= fifthNumber) {
            highest = firstNumber;
	 System.out.println("the highest number is first number: " + highest);

        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber && secondNumber >= fourthNumber && secondNumber >= fifthNumber) {
            highest = secondNumber;
	 System.out.println("the highest number is second number: " + highest);
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber && thirdNumber >= fourthNumber && thirdNumber >= fifthNumber) {
            highest = thirdNumber;
	 System.out.println("the highest number is third number: " + highest);
        } else if (fourthNumber >= firstNumber && fourthNumber >= secondNumber && fourthNumber >= thirdNumber && fourthNumber >= fifthNumber) {
            highest = fourthNumber;
	 System.out.println("the highest number is fouth number: " + highest);
        } else if (fifthNumber >= firstNumber && fifthNumber >= secondNumber && fifthNumber >= thirdNumber && fifthNumber >= fourthNumber) {
            highest = fifthNumber;
	 System.out.println("the highest number is fifth number: " + highest);
        }
	
	
	if (firstNumber <= secondNumber && firstNumber <= thirdNumber && firstNumber <= fourthNumber && firstNumber <= fifthNumber) {
            lowest = firstNumber;
	 System.out.println("the lowest number is first number: " + lowest);

        } else if (secondNumber <= firstNumber && secondNumber<= thirdNumber && secondNumber <= fourthNumber && secondNumber <= fifthNumber) {
            lowest = secondNumber;
	 System.out.println("the highest number is second number: " + lowest);
        } else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber && thirdNumber <= fourthNumber && thirdNumber <= fifthNumber) {
            lowest = thirdNumber;
	 System.out.println("the highest number is third number: " + lowest);
        } else if (fourthNumber <= firstNumber && fourthNumber <= secondNumber && fourthNumber <= thirdNumber && fourthNumber <= fifthNumber) {
           lowest = fourthNumber;
	 System.out.println("the highest number is fouth number: " + lowest);
        } else if (fifthNumber <= firstNumber && fifthNumber <= secondNumber && fifthNumber <= thirdNumber && fifthNumber <= fourthNumber) {
           lowest = fifthNumber;
	 System.out.println("the highest number is fifth number: " + lowest);
        }
}
}

