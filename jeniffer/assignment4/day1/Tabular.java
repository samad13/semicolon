import java.util.Scanner; 
	public class Tabular {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("\nN\tN2\tN3\tN4");
	int count = 1;
	
	while(count <= 5) {
	
	System.out.println(count + "\t " + (count * count) +  " \t " + (count * count *count ) + " \t" + (count * count * count * count));		
	
	count ++;

	}
	
 
}
	
}




