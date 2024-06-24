import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
	double radius = input.nextDouble();
	
	double formula = 3.14159;
	double perimeter = 2 * radius * formula;
	double area = radius * radius * formula;
        

        System.out.printf("area is "+ area + " and perimeter " + perimeter);
    }
}
