import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
	float radius = input.nextFloat();
	float pi= 3.14159F;
	float diameter = 2 * radius;
	float centimeter = 2 *pi * radius ;
	float area = pi *radius*radius ;
     

        System.out.printf("diameter is "+ diameter + " and centimeter " + centimeter +" area " + area);
    }
}

