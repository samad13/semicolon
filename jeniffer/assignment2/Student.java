import java.util.Scanner;
public class Student {
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	
	int score = 0;
	while (score != -1){	
	System.out.println("Enter your score: ");
	score = input.nextInt();
	  if (score >= 60){
	  System.out.println("You pass the exam");
	  }else if (score <= 59);{
	  System.out.println("You dont pass the exam");}
}
}


}