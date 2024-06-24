import java.util.Scanner;

public class Kilograms{ 
	
	//opening of method main to begin executioin of java code
	public static void main(String [] args){
	

	//declare 1 kilogram to pounds formula
	double kilogram = 0.454;

	
	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("enter a number in pounds: "); //prompt
	//read the pounds number inputed from user
	double pounds = input.nextDouble();
	
	
	//multiply feet with kilograms formula to get the actual kilograms
	double kilograms = (pounds * kilogram); 

	
	//display the conversion of pounds to kilograms
	System.out.println( pounds + " pounds is:" + kilograms + " kilograms");



}// ends method main
}// ends class Kilograms.