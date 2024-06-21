import java.util.Scanner;


public class CastFlaoting{
	public static void main(String[]args){

	
	Scanner input = new Scanner(System.in);	

	System.out.println("\na\tb\tpow(a,b)");
	int a = 1;
	
	while(a <= 5) {
	int b = a +1;
	System.out.println(a + "\t " +(int) (b ) + "\t " +(int) Math.pow(a,b));		
	
	a ++;

	}

}




}