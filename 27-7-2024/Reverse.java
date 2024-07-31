import java.util.Arrays;
public class Reverse{

    public int[] reverse(int[] array) {
	int count = 0;
	int[] reverseArray = new int[array.length];
        for (int counter = array.length-1; counter >= 0; counter--) {
                reverseArray[count] = array[counter];
		count++;
            
        }

        return reverseArray;
    }


    public static void main(String[] args) {
            
        int[] array = {1,2,3,4,5,6,7,8,9};
        
        Reverse reverse = new Reverse();
        int[] result = reverse.reverse(array);
        
        System.out.println("the reverse array is: " + Arrays.toString(result));
        
    }
}
