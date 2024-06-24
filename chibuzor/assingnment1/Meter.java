import java.util.Scanner;

public class Meter{ 
	
	//opening of method main to begin executioin of java code
	public static void main(String [] args){
	

	//declare meter formula
	double meter = 0.3048;

	
	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("enter feet number: "); //prompt
	//read the feet number inputed from user
	double feet = input.nextDouble();
	
	
	//multiply feet with meter formula to get the meters
	double meters = (feet * meter); 

	
	//display the conversion of feet to meters
	System.out.println( feet + " feet is:" + meters + " meters");



}// ends method main
}// ends class Meter.