import java.util.Scanner;

public class Years{ 
	
	//opening of method main to begin executioin of java code
	public static void main(String [] args){
	
	//create an integer to save the number 525600, which is the number of minutes in a year
	int miniutesPerYear = 525600;
	int daysPerYear = 365;

	//create a scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of minutes: "); //prompt
        //read the minutes inputed from user
	int minutes = input.nextInt();


	//divide minutes with minuteperyear 
	int result = (minutes / miniutesPerYear); 

	//display the result of the division between minutesPerYear and minutes
	System.out.println(minutes + " is approximately " + result + " years");



}// ends method main
}// ends class Years.
