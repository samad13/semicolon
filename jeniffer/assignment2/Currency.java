import java.util.Scanner;
public class Currency {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the exchange rate from dollars to RMB: ");
	double xchangeRate = input.nextDouble();

	System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	int zeroOrone = input.nextInt();

	if(zeroOrone == 0){
	System.out.print("Enter the dollars amount: ");
	double dollarsToRmb = input.nextDouble();

	System.out.print("$"+dollarsToRmb + " is " + dollarsToRmb * xchangeRate +" yuan"  );

	}else if(zeroOrone == 1){
	System.out.print("Enter the RMB amount: ");
	double dollarsToRmb = input.nextDouble();

	System.out.print(dollarsToRmb + " yuan is $"+ dollarsToRmb / xchangeRate  );
	}else{ 
	System.out.print("enter 0 or 1");
}

	}
}
