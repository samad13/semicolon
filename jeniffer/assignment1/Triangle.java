import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter length of sides: ");
	double length = input.nextDouble();
	 double allSide = length * 3;

	double area = Math.sqrt(3/4) * (allSide)* 2;
	double volume = area * length;
	
	
	System.out.print("triangle" +  area  + " area" + "prism: " + volume );

	}
}

