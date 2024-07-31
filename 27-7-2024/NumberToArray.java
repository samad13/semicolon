import java.util.Arrays;
public class NumberToArray{



public static void main(String[] args) {

        String normal = "123444";
       
        NumberToArray number = new  NumberToArray();
        String [] result =  number.concat(normal);
        
        System.out.println(Arrays.toString(result));


}
   
    public String [] concat(String string) {	
	String[] reverseString = new String[string.length()];
	for (int count = 0;count < string.length(); count ++) {
             reverseString[count] = String.valueOf(string.charAt(count));
                   }

	return  reverseString;

        	
    }


}

