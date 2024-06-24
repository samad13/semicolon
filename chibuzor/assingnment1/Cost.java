import java.util.Scanner;

public class Cost{
	public static void main(String [] args){
	
	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter the driving distance: "); //prompt
	//read the distance to drive from user
	double driveDistance = input.nextDouble();

	System.out.print("enter the miles per gallon: "); //prompt
	//read the the miles per gallon from user
	double milesPerGallon = input.nextDouble();

	System.out.print("enter price per gallon: "); //prompt
	// read the price per gallon from user
	double pricePerGallon = input.nextDouble();
	
	//divide the driving distance, with miles per gallon,then multiply the answer with price per gallon.
	double costOfDriving = (driveDistance/milesPerGallon) * pricePerGallon; 
	
	//display the cost of driving
	System.out.println("the cost of driving is:" + String.format("%.2f",costOfDriving));



}// ends method main
}// ends class Cost.