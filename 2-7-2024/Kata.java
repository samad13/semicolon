import java.util.Scanner;
public class Kata{
	
	public static boolean isEvenBoolean(int number){
			if(number % 2 == 0) return true; 
			return false;

	}

	public static boolean isPrimeNumber(int number){
		int count = 0;
		for(int i = 1; i <=  number; i++){

			if(number % i == 0) 
			count++;
		}			
		if(count > 2) return false;
		return true;			
	}

	
	public static int positiveDifferece(int number1, int number2){
		 int result = 0;
			if(number1 < number2){
			result = number2 - number1;
		} result = number2 - number1;
		
		return result;	
		

	}
	//4
	public static float qoutientDivide(int number1, int number2){
		 if(number2 == 0) {
		return 0;
		}float answer = (float) (number1 / number2);
		
		return answer;			

	}

	//5
	;
    public static int factor(int number){
	int factor = 0;
        for (int count = 1; count <= number; count ++) {
		if (number % count == 0) {
		factor++;
		}
        }
	return factor;
}

	//7
	public static boolean palindrome(int number){

	
	int value1 = number / 1000;
	int value2 = value1 / 10;
	int value3 = value1 % 10;
	int value4 = number % 100;
	int value5 = value4 % 10;
	int value6 = value4 / 10;

	if(value2 == value5 && value3 == value6){
	return true ;
	}else{	
	return false;
	}

	}

	
	
}