import java.util.Arrays;
public class VariousFunction{

    public int computesForLoop( int[] array) {
	int total = 0;
	        for (int counter = 0; counter < array.length; counter++) {
                     total +=array[counter];      	
        }

        	return  total;
    }

	
 public int computesWhileLoop( int[] array) {
	int total = 0;
	int counter = 0;
	        while ( counter < array.length) {
                     total +=array[counter]; 
			counter++;    	
        }

        	return  total;
    }

public int computesDoWhileLoop( int[] array) {
	int total = 0;
	int counter = 0;
	       do{
                   total +=array[counter];
			 counter++;   	
        }while( counter < array.length);
	
        	return  total;
    }
	

}
