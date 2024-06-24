import java.util.Scanner;

public class Acceleration{ 
	
	//opening of metthod main to begin executioin of java code
	public static void main(String [] args){
	

	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	System.out.print( "Enter v0, v1, and t: "); // prompt

	//Read the first formula
	double v0 = input.nextDouble();

	//Read the second formula
	double v1 = input.nextDouble();

	//Read the third formula
	double t =  input.nextDouble();

	
	//display the acceleration
	System.out.println("The averege acceleration is:" + String.format("%f",(v1 - v0) / t));


}// ends method main
}// ends class Acceleration.