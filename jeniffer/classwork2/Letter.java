import java.util.Scanner;
public class Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");

        String Letter = input.nextLine().toUpperCase();

       
        if(Letter.equals("A")){
	System.out.print("Numeric value is: 4");
	}else if (Letter.equals("B")){
	System.out.print("Numeric value is: 3");
	}else if (Letter.equals("C")){
	System.out.print("Numeric value is: 2");
	}else if (Letter.equals("D")){
	System.out.print("Numeric value is: 1");
	}else if (Letter.equals("F")){
	System.out.print("Numeric value is: 0");
	}else{ System.out.print(Letter +" is an invalid grade");
	}

    }
}
