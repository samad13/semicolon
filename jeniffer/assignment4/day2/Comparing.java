import java.util.Scanner;
public class Comparing {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("input firt integer: ");
	int number = input.nextInt();


	int numberSquared = (number * number);
	
	if(number > 100 && numberSquared > 100){
	System.out.println("The " + number + " and it square "  + numberSquared + " are greater than 100" );
	} else if(number == 100 && numberSquared == 100){
	System.out.println("The" + number + " and it square "  + numberSquared +" are equal 100" );
	} else if(number != 100 && numberSquared != 100){
	System.out.println("The " + number + " and it square "  + numberSquared +" are not equal to 100" );
	} else if(number < 100 && numberSquared < 100){
	System.out.println("The " + number + " and it square "  + numberSquared +" are lesser than 100" );
	}
	

}
}

