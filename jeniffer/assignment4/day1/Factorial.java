import java.util.Scanner;

public class Factorial{ 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	

	System.out.println("Enter number: ");
     	int number = input.nextInt();
	int loop = 1;
	while (number >= 1) { 
	loop = number * loop;
	number -- ; 
				}
System.out.println(loop); 


	

}
}
