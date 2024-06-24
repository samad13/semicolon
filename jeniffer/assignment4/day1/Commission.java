import java.util.Scanner; 
	public class Commission {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int numberOfItemSold = 0;
	int total = 0;

	System.out.print("Staff name: ");	
	String name = input.nextLine();

	System.out.print("Item price: ");	
	int itemsSold = input.nextInt();
	
	while(itemsSold != -1) {
	 
	total = total + itemsSold;
	numberOfItemSold = numberOfItemSold + 1;
	

	System.out.print("Item price: ");	
	itemsSold = input.nextInt();

	 }

	if(numberOfItemSold != 0){
	double percentageOnSale = (double) total * 0.09;;
	 double baseSalary = 200 +  percentageOnSale;
	 System.out.println( "dear Mr/mrs/miss, " +  name + " you sold " + numberOfItemSold  + 
				" item this month, and this is your month salary " + baseSalary);

	}
	
 	
	
}
	
}




