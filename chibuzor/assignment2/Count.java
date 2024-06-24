import java.util.Scanner;

public class Count{ 
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	

        
	int number = 0;
	int positive = 0;
	int negative = 0;
	int zero = 0;
	
	while ( number != -1) { 
	
	System.out.println("Enter number: ");
	number = input.nextInt();
	
	if(number == 0){
	  zero+=1;
	} else if(number > 0){
	 positive+=1;
	} else{
	negative +=1;
	}
	
	}
	
	
	System.out.println("positive: " + positive + " negative: " + negative + " zero: " + zero);
	

}
}
