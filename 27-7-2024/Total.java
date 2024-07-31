import java.util.Arrays;
public class Total{

    public int computes( int[] array) {
	int total = 0;
	        for (int counter = 0; counter < array.length; counter++) {
                     total +=array[counter];      	
        }

        	return  total;
    }



public static void main(String[] args) {
            
        int[] array = {2,2,2,2,2,2,2,2,2};
        
        Total total = new Total();
        
	 int result = total.computes(array);
        System.out.println("the even index is: " + result);
        
    }
}


