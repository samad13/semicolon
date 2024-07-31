import java.util.Arrays;
public class Odd{

    public String element( int[] array) {
		String returningOdd = "";

	

	        for (int counter = 0; counter <array.length; counter++) {
                if( counter % 2 != 0){
		returningOdd += array[counter];
		}
            	
        }

        	return  returningOdd;
    }


public static void main(String[] args) {
            
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        Odd odd = new Odd();
        
        System.out.println("the odd element is: " + odd.element(array));
        
    }
}

