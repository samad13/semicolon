import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	
	String asterik1 = " ";
	String asterik2 = " ";
	String asterik3 = " ";
	String asterik4 = " ";
	String asterik5 = " ";


 
	System.out.print("input number between 1 and 30 or else system will terminate :");
	int number1 =  input.nextInt();
	if(number1 >= 1 && number1 <= 30 ){
	for(int i = 1;i <= number1; i++){
	asterik1 +="*";
	}
	}else System.exit(0);
	System.out.print("input number between 1 and 30 or else system will terminate :");
	int number2 =  input.nextInt();
	if(number2 >= 1 && number2 <= 30){
	for(int i = 1;i <= number2; i++){
		asterik2 +="*";
	}

	} else System.exit(0);

	System.out.print("input number between 1 and 30 or else system will terminate :");
	int number3 =  input.nextInt();
	if(number3 >= 1 && number3 <= 30){

	for(int i = 1;i <= number3; i++){
		asterik3 +="*";
	}

	} else System.exit(0);

	System.out.print("input number between 1 and 30 or else system will terminate :");
	int number4 =  input.nextInt();
	if(number4 >= 1 && number4 <= 30){

	for(int i = 1;i <= number4; i++){
		asterik4 +="*";
	}

	} else System.exit(0);

	System.out.print("input number between 1 and 30 or else system will terminate :");
	int number5 =  input.nextInt();
	if(number5 >= 1 && number5 <= 30){
	for(int i = 1;i <= number5; i++){
		asterik5 +="*";
	}
	
		
		System.out.println(asterik1);
		System.out.println(asterik2);
		System.out.println(asterik3);
		System.out.println(asterik4);
		System.out.println(asterik5);

	 }else System.exit(0);




           }
}

