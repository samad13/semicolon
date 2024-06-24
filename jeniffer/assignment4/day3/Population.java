import java.util.Scanner;
public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	System.out.println("input the world population");
	Long population = input.nextLong();	
	
	System.out.println("input percentage growth");
	double percent = input.nextDouble() / 100;


	long  growth1 =(long) (population * percent); 
	long year1  = (population + growth1);
	
	long  growth2 = (long)(year1 * percent);
	long year2 =  year1 + growth2;
	
	long  growth3 = (long) (year2 * percent); 
	long year3  = year2 + growth3;
	
	long  growth4 = (long) (year3 * percent);
	long year4 =  year3 + growth4;
	
	long  growth5 =(long) (year4 * percent);
	long  year5 =  year4 + growth5;
		
	System.out.println("First year growth: "+ year1 + " second year growth: " + year2 +" third year growth: "+ year3 + " Fouth year growth: "+ year4 + " Fifth year growth: " + year5);
         
    }
}
