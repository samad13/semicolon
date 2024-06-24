import java.util.Scanner;

public class Energy{ 
	
	//opening of metthod main to begin executioin of java code
	public static void main(String [] args){
	
	//create an integer to save the number 4184
	int a = 4184;

	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the amount of water in kilograms: "); //prompt
        //read the initial amount of water in kg inputed from user
	double M = input.nextDouble();


	System.out.print("Enter the initial temperature: "); //prompt
	//read the initial temperature inputed from user
	double initialTemperature = input.nextDouble();


	System.out.print("Enter the final temperature: "); //prompt
	//read the final temperature inputed from user
	double finalTemperature= input.nextDouble();

	
	//subtract final temperature with initial temperature, then multiply M with the answer, then also multiply that with a 
	double Q = M * (finalTemperature - initialTemperature) * a; 

	//display the energy needed accordinly
	System.out.println("The energy needed is " + Q);



}// ends method main
}// ends class Energy.
