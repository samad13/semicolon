import java.util.Scanner; 
	public class GasMillage {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("How many miles driven : ");
	int miles = input.nextInt();
	
	System.out.print("How many gallons used: ");
	int gallons = input.nextInt();	

	float combinedMilesPerHour = 0;

	while ( miles != -1) {

	float milePerGallon = miles / gallons;
	System.out.println("This is the mile per gallons used for each trip : " + milePerGallon);

	System.out.print("How many miles driven : ");
	miles = input.nextInt();
	
	System.out.print("How many gallons used: ");
	gallons = input.nextInt();
	

	combinedMilesPerHour += milePerGallon;

	 }
	System.out.print("this is the combined miles by all drivers: " + combinedMilesPerHour);
}
	
}