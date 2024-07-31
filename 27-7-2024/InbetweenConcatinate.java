import java.util.Arrays;
public class InbetweenConcatinate{
   
    public String [] concat(String[] array,String[] string) {
	int count1 = 0;
	int count2 = 0;
	String[] reverseString = new String[array.length + string.length ];
	
	        for (int counter = 0; counter <reverseString.length; counter++) {
			if(counter % 2 != 0){
                     reverseString[counter] = array[count1++]; 
	    		}
			else if(counter % 2 == 0){
	                      reverseString[counter] =  string[count2++]; 
			 }    	 	
        } 	
	
		
		
	return  reverseString;

        	
    }


public static void main(String[] args) {

        String[] array = {"1","2","3","4","5","6","7","8","9"};
        String[] string = {"a","b","c","d","e","f","g","h","i"};
        InbetweenConcatinate con = new  InbetweenConcatinate();
        String [] result =  con.concat(array, string);
        
        System.out.println(Arrays.toString(result));
        
    }














}



