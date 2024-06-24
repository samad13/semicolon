import java.util.Scanner;

public class LargestAndSmallest{ 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	

       	int largest =  0;
	int smallest = 0;
	int number = 0;


	while (true) {
	 System.out.println("Enter number: ");
	number = input.nextInt();
	
	if(number  < smallest){
	  smallest = number;

	} else if(number > largest){
	 largest = number;
	}
	
	
	System.out.println("smallest: " + smallest + " largest: " + largest);
	if(number == -1)
	break;
	}
	
	//System.out.println("smallest: " + smallest + " largest: " + largest);
	

}
}
