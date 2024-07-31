import java.util.Arrays;
public class Palindrome{
   
    String palindrome(String[] array) {
	int count = 0;
	String[] reverseString = new String[array.length];
	        for (int counter = array.length-1; counter >= 0; counter--) {
                      reverseString[count] = array[counter]; 
			count++;     	
        } 	
		if(Arrays.toString(reverseString).equals(Arrays.toString(array))){
		return "it a palindrome";	
		}else
		return  "it not a palindrome";

        	
    }
}
