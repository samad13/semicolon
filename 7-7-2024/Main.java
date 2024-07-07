import java.util.Scanner;
public class Main{
		
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
		
		System.out.print("Enter number of delivery by riders today :");
		int number = input.nextInt();
		System.out.println(Delivery.delivery(number));
				

	}

}