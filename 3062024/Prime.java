import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	System.out.println("put  NUMBER: ");
	int number = input.nextInt();
	if(number > 1){
	boolean prime = false;
		for (int i = 2; i <= number / 2; i ++) {
		if (number % i == 0) {
		prime = true;
		break;
		}
        }if(!prime) {
                System.out.println("it a prime number");
            }else System.out.println("not a prime");
	}else System.out.println("number 1 and below are not prime");
}}
