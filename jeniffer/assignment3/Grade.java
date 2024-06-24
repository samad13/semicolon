import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");

        String grade = input.nextLine().toUpperCase();
        System.out.println(grade);

        if (grade.equals("A")) {
            System.out.println("The numeric value of grade A is 4");
        } else if (grade.equals("B")) {
            System.out.println("The numeric value of grade B is 3");
        } else if (grade.equals("C")) {
            System.out.println("The numeric value of grade C is 2");
        } else if (grade.equals("D")) {
            System.out.println("The numeric value of grade D is 1");
        } else if (grade.equals("F")) {
            System.out.println("The numeric value of grade F is 0");
        } else {
            System.out.print(grade + " is an invalid value of grade");
        }

    }
}
