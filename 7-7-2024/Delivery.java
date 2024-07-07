public class  Delivery{
	
	public static  int delivery( int succesfullDelivery){
				int amountperPercel = 0,
				basePay = 5000;

			if(succesfullDelivery < 50){
			amountperPercel = 160 * succesfullDelivery + basePay;
			}else if(succesfullDelivery > 49 && succesfullDelivery <60 ){
				amountperPercel = 200 * succesfullDelivery + basePay;

			}else  if (succesfullDelivery >59 && succesfullDelivery < 70){
				amountperPercel = 250 * succesfullDelivery + basePay;

			}else  if (succesfullDelivery >=70){
				amountperPercel = 500 * succesfullDelivery + basePay;

				}
			


			return amountperPercel;

	}


	
	
} 