import java.util.Date; 
import java.util.Calendar;
import java.util.Scanner;
public class Menstrual{
	
	public static void main(String[] args) { 

	 Scanner input = new Scanner(System.in);

		
		Calendar calender = Calendar.getInstance(); 
		Calendar calender2 = Calendar.getInstance();
		System.out.println("welcome to menstral app\n");

		
		System.out.println("First Day of Your Last Period: ");
		int day = input.nextInt();
		calender.set(Calendar.DATE, day);

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
				
		System.out.println("Average Length of Circles: ");
		int circle = input.nextInt();
					 
		calender.add(Calendar.DATE, circle ); 
		Date dateOne = calender.getTime();
	

		calender.add(Calendar.DATE, flowdays ); 
		Date datetwo = calender.getTime();

		calender.add(Calendar.DATE, -20 ); 
		Date ovulation = calender.getTime();
		calender.add(Calendar.DATE, 4 ); 
		Date ovulation2 = calender.getTime();
		
		

		System.out.println("your next PERIOD is"	+ " between: " + dateOne+ " To " +datetwo);
		
		System.out.println("your next OVULATION is probably between: "+ ovulation	+ " and "+ ovulation2 );
		
		
		calender2.set(Calendar.DATE, day);

		calender2.set(Calendar.MONTH, month); 

		calender2.set(Calendar.YEAR, year); 

		flowdays+=1;
		calender2.add(Calendar.DATE, flowdays);
		Date safePeriods1 = calender2.getTime();
		calender.add(Calendar.DATE, -5);
		Date safePeriods2 = calender.getTime();
		calender.add(Calendar.DATE, 6);
		Date safePeriods3 = calender.getTime();
		calender.add(Calendar.DATE, 10);
		Date safePeriods4 = calender.getTime();


		System.out.println("your FREE DAYS is probably between: "+ safePeriods1  	+ " and " +  safePeriods2 +"\nthen between: "+ safePeriods3  	+ " and " +  safePeriods4 );
		

		}
		else {
			
		System.out.println("Your month should be between 1 and 12");
		}
	} 



} 











