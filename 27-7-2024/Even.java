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



}


