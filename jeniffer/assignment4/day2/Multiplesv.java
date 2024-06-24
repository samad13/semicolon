import java.util.Scanner;
public class Multiplesv{
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);


	System.out.print("input first integer: ");
	int firstNumber = input.nextInt();
	
	System.out.print("input second integer: ");
	int secondNumber = input.nextInt();

	int first = firstNumber * 3;
	int second = secondNumber * 2;
	
	
	if(first % second == 0){
	System.out.println(first +" is a multiple of  " + second);
	}else System.out.println(first +" is not multiple of "+ second);;

	



}}