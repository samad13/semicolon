import java.util.Scanner; 
	public class Table {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("\nnumber\tsquare\tcube");
	int count = 1;
	
	while(count <= 10) {
	
	System.out.println(count + "\t " + (count * count) +  " \t " + (count * count *count ));		
	
	count ++;

	}
	
 
}
	
}




