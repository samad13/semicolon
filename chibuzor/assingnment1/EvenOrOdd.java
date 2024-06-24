import java.util.Scanner;

public class EvenOrOdd{
	public static void main(String [] args){
	
	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	

	System.out.print("enter number: "); //prompt
	int number = input.nextint();// read the distance to drive from user

	if(number%2== 0){
	System.out.print(" ");
}

	//then multiply the answer with price per gallon.

	System.out.println("the cost of driving is:" + String.format("%.2f",costOfDriving)); //display the cost of driving



}// ends method main
}// ends class Cost.