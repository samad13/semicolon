import java.util.Scanner;

public class Bmi{ 
	
	public static void main(String [] args){
	
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("enter weight in pounds: "); 

	int weight = input.nextInt();

	
	System.out.print("enter height in inches: "); 

	int height = input.nextInt();
	
	int times703 = weight * 703;

	
	int BMI = times703 / (height * height); 
	
	System.out.println("BMI is: " +   BMI);
	System.out.printf("BMI Categories Underweight = <18.5 Normal weight = 18.5–24.9 over weight = = 25–29.9 Obesity = BMI of 30 or greater" );


}
}