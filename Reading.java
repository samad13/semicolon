import java.util.Scanner;

public class Reading{ 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	

        
	System.out.println("Enter number: ");
	int firsNumber = input.nextInt();
	int otherNumber = 0;
	
	while ( firsNumber > otherNumber ) { 
	
	System.out.println("Enter number: ");
	 otherNumber = input.nextInt();
	
	otherNumber = otherNumber + otherNumber;
	 

	
	}
	
	System.out.println("Other number :" + otherNumber + " is now higher or equal to your first number: " +  firsNumber);
	

}
}
