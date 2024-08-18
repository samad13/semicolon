import java.util.Arrays;
public class Logistics{

 
	
 
public double backToSender( int collectionRate) {
		int amountPercel = collectionRate;
		double basePay = 5000;

		double dailyWage = 0;

		double rate = (double) collectionRate * 0.01;
		
		if(rate < 0.5){
		dailyWage =  (160 * amountPercel) + basePay;
		
		}else if(rate >= 0.5 && rate <= 0.59){
		dailyWage =  (200* amountPercel) + basePay;
		
		}else if(rate >= 0.6 && rate<= 0.69){
		dailyWage =  (250* amountPercel) + basePay;
		
		}else if(rate >= 0.7){
		dailyWage =  (500* amountPercel) + basePay;
		
		}


		return dailyWage;




    }
	

}
