import java.util.Arrays;
public class Even{

    public String element( int[] array) {
	String returningEven = "";
	        for (int counter = 0; counter <array.length; counter++) {
                if( counter % 2 == 0){
		returningEven  += array[counter];
		}
            	
        }

        	return  returningEven;
    }



public static void main(String[] args) {
            
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        Even even = new Even();
        
        System.out.println("the even index is: " + even.element(array));
        
    }
}


