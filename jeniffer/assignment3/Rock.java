import java.util.Scanner;
public class Rock {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
 
	int highest = 3 ;
	System.out.print("scissor (0), rock (1), paper(2): ");
	int player = input.nextInt();

	int computer = (int)(Math.random() * highest);
	System.out.print(computer);
	if ( player == 0 && computer == 0){
	 System.out.print("you both input scissor, it a draw");}
	else if(player == 1 && computer == 1){
	 System.out.print("you both input rock, it a draw");	}
	else if(player == 2 && computer == 2){
	 System.out.print("you both input paper, it a draw");}
	else if (player == 0 && computer == 1){
	 System.out.print(" computer is rock, you loosw");	}
	else if (player == 0 && computer == 2){
	 System.out.print("the computer is paper, you win");	}
	else if (player == 1 && computer == 0){
	 System.out.print("you input rock, you win");	}
	else if (player == 1 && computer == 2){
	 System.out.print("computer input paper, you won");	}
	else if (player == 2 && computer == 0){
	 System.out.print("computer input paper, you won");	}
	else if (player == 2 && computer == 1){
	 System.out.print("computer input scisosrs, you loose");	
}
	
	}
}
