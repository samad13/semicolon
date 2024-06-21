import java.util.Scanner;

public class LargestAndSmallest{ 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	

       	int largest = 0;
	int smallest = 0;
	int number = 0;

	while ( number != -1) { 
	System.out.println("Enter number: ");
	number = input.nextInt();
	if (number != -1){
	if(number  >= largest){
	  largest = number;
	} else if(number <= smallest){
	 smallest = number;
	}	
	}
	
	}
	
	System.out.println("largest: " + largest + " smallest: " + smallest);
	

}
}
