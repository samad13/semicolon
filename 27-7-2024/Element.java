import java.util.Arrays;
public class Element{

    public boolean element(int number, int[] array) {
        for (int counter = 0; counter <array.length; counter++) {
                if( number == array[counter]){
		return true;
		}
            	
        }

        	return false;
    }


    public static void main(String[] args) {
            
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        Element element = new Element();
       

	System.out.println(element.element(23, array));
        
               
    }
}




