import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class AssignmentTest{

	@Test
	public void testToCheckLargest(){


	LargestElement largest = new LargestElement();
	
	int[] array = {1, 2, 6, 6, 8, 5, 6, 7};

	int result = largest.findLargestElement(array);

	assertEquals(8, result);

}

@Test
	public void testToCheckReverse(){


	var reverse = new Reverse();
	
	int[] array = {1, 2, 6, 6, 8, 5, 6, 7};

	int[] result = reverse.reverse(array);
	int[] theReverse = {7, 6, 5, 8, 6, 6, 2, 1};

	assertArrayEquals(theReverse, result);


}


@Test
	public void testToCheckElement(){

	Element element = new Element();
	
	int[] array = {1, 2, 6, 6, 8, 5, 6, 7};


	assertEquals(true,element.element(8, array));

}

@Test
	public void testToCheckElementInOdd(){

	Odd odd= new Odd();
	
	int[] array = {1,2,3,4,5,6,7,8,9};

	assertEquals("2468",odd.element(array));

}


@Test
	public void testToCheckElementInEven(){

	Even even= new Even();
	
	int[] array = {1,2,3,4,5,6,7,8,9};

	
	assertEquals("13579",even.element(array));

}


@Test
	public void testToCheckTotal(){

	Total total = new Total();
	
	int[] array = {1,2,3,4,5,6,7,8,9};

	
	assertEquals(45,total.computes(array));

}

@Test
	public void testToCheckPalindrome(){

	Palindrome check = new Palindrome();
	
	String[] array = {"r", "a", "c", "e", "c", "a", "r"};
	
		
	assertEquals("it a palindrome",check.palindrome(array));

}

@Test
	public void testToCheckConcantinate(){

	Concantinate check = new Concantinate();
	
	String[] array = {"1","2","3","4","5","6","7","8","9"};
        String[] string = {"a","b","c","d","e","d","f","g","h"};


	String[]  joint ={"1","2","3","4","5","6","7","8","9","a","b","c","d","e","d","f","g","h"};
		
	assertArrayEquals(joint,check.concat(array,string));

}

@Test
	public void testToCheckNumberToArray(){

	NumberToArray check = new NumberToArray();
	
	String result = "123456";
	
	String[]  expectxArray ={"1","2","3","4","5","6"};
	String[] resultArray = check.concat(result);
		
	assertArrayEquals(expectxArray,  resultArray);

}




}











            

        
