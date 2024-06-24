import java.util.Scanner;
public class Rock {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int smallest = 1;  int highest = 3 ;
	System.out.print("scissor (0), rock (1), paper(2): ");
	int player = input.nextInt();

	int computer = (int)(Math.random() * (highest - smallest)+ 1) - smallest;

	if ( player == 0 && computer == 0){
	 System.out.print("you both input rock, it a draw");}
	else if(player == 1 && computer == 1){
	 System.out.print("you both input paper, it a draw");	}
	else if(player == 2 && computer == 2){
	 System.out.print("you both input scissors, it a draw");	}
	else if (player == 0 && computer == 1){
	 System.out.print("the computer is scissors, you won");	}
	else if (player == 0 && computer == 2){
	 System.out.print("the computer is rock, you loose");	}
	else if (player == 1 && computer == 0){
	 System.out.print("computer input rock, you loose");	}
	else if (player == 1 && computer == 2){
	 System.out.print("computer input paper, you won");	}
	else if (player == 2 && computer == 0){
	 System.out.print("computer input paper, you won");	}
	else if (player == 2 && computer == 1){
	 System.out.print("computer input scisosrs, you loose");	}
	
	}
}
