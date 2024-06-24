import java.util.Scanner;

public class RunawayLength{ 
	
	//opening of metthod main to begin executioin of java code
	public static void main(String [] args){
	//v2 = in meter per second
	//a = meter per secod squared then divide v2/2a

	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	System.out.print( "Enter run "); // prompt

	//Read the first formula
	double v0 = input.nextDouble();

	//Read the second formula
	double v1 = input.nextDouble();

	//Read the third formula
	double t =  input.nextDouble();

	
	//display the acceleration
	System.out.println("The averege acceleration is:" + String.format("%f",(v1 - v0) / t))


}// ends method main
}// ends class Acceleration.