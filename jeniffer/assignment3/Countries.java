import java.util.Arrays;
import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three countries:");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
        String city3 = input.nextLine();

        String[] cities = {city1, city2, city3 };

       Arrays.sort(cities, (a, b) -> b.compareTo(a));

        System.out.print("The three countries in descending order are: ");
	for (String city: cities){
        System.out.println(city);}
    }
}
