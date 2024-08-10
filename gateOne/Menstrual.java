import java.util.Date; 
import java.util.Calendar;
import java.util.Scanner;
public class Menstrual{
	
	public static void main(String[] args) { 

	 Scanner input = new Scanner(System.in);

		
		Calendar calender = Calendar.getInstance(); 
		//Calendar calender2 = Calendar.getInstance();
		System.out.println("welcome to menstral app\n");

		
		System.out.println("First Day of Your Last Period: ");
		int day = input.nextInt();
		calender.set(Calendar.DATE, day);

		//System.out.println("enter month: ");
		//int daytime = Calendar.DATE -4;

		System.out.println("enter month: ");
	  	int month = input.nextInt();

		if(month >=1 && month < 12) {
		month -=1;
		calender.set(Calendar.MONTH, month); 

		
		System.out.println("enter year: ");
		int year = input.nextInt();
		calender.set(Calendar.YEAR, year); 

		System.out.println("How long did it last? : ");
		int flowdays = input.nextInt();
		flowdays -=1;
		calender.add(Calendar.DATE, flowdays ); 

		Date dateOne = calender.getTime(); 
		

		System.out.println("Period  ends: "
						+ dateOne); 
		System.out.println("Average Length of Circles: ");
		int circle = input.nextInt();
					 
		calender.add(Calendar.DATE, circle ); 
		dateOne = calender.getTime();
	


		calender.add(Calendar.DATE, flowdays ); 
		Date datetwo = calender.getTime();

		calender.add(Calendar.DATE, -14 ); 
		Date ovulation = calender.getTime();
		
		
		//calculate from the beggining of the first day of array
		System.out.println("your next period is"	+ " between: " + dateOne+ " To " +datetwo);
		
		System.out.println("your next ovulaton is"	+ " between: " + ovulation);


		}
		else {
			
		System.out.println("Your month should be between 1 and 12");
		}
	} 



} 











