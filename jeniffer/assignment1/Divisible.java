
import java.util.Scanner;
public class Divisible {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("enter an integer: ");
	int number = input.nextInt();
	if(number % 3 == 0){
	  System.out.print("Integer " + number + " is divisible by 3");
	 }else{ 
		System.out.print("Integer " + number + " is not divisible by 3");
	   }

	
	}
}