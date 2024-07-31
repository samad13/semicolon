import java.util.Scanner;

public class LargestElement {

    public int findLargestElement(int[] array) {
        int largest = array[0];
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] > largest) {
                largest = array[counter];
            }
        }
        return largest;
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int[] array = {5, 8, 9, 10, 11, 27, 13, 24, 4, 2, 1};
        
        LargestElement largestElement = new LargestElement();
        int result = largestElement.findLargestElement(array);
        
        System.out.println("the largest element in the array is: " + result);
        
        
    }
}
