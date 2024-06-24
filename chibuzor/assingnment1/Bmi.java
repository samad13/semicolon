import java.util.Scanner;

public class Bmi{ 
	
	//opening of method main to begin executioin of java code
	public static void main(String [] args){
	
	
	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("enter weight in pounds: "); //prompt
	//Read the weight in pounds inputed from user
	double weight = input.nextDouble();

	
	System.out.print("enter height in inches: "); //prompt
	//Read the height in inches inputed from user
	double height = input.nextDouble();
	

	//Divide weight with height meter square
	double BMI = (height * height) / weight ; 

	
	//display the conversion of pounds to kilograms
	System.out.println("BMI is: " + String.format("%f",  BMI));



}// ends method main
}// ends class Bmi.