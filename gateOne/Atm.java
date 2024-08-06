import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
	System.out.println("\nHow many customer do you want to register:");
	int customer =  input.nextInt();
	Account[] account1 = new Account[customer];

	for(int count = 0; count < customer; count++ ){
          System.out.println("First Name: ");
	  String firstName = input.nextLine();
          System.out.println("Last Name: ");
	  String lastName = input.nextLine();
          System.out.println("Account Number: ");
	  String accountNumber = input.nextLine();
          System.out.println(" input account Balance: "); //make sure this dont fall through anymore
	  double balance = input.nextDouble();
	  System.out.println("enter your 4 digit pin: ");
	  String pin = input.nextLine();
	
	
	 account1[count]= new Account(firstName,lastName, accountNumber,balance,  pin);
	int  choose =0;
        int counter = 0;
        while (choose!=  6) {
            System.out.println("\nWelcome to GTB:");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Change pin");
	    System.out.println("6.input another customer ");
	     System.out.println("7. Exit");
            System.out.print("waiting you wan do Oga: ");
            choose =  input.nextInt();
	    input.nextLine();
	              switch (choose) {
                case 1:
                    System.out.println("\n input pin to check account details:");
		   String pincode = input.nextLine();
		  if(pincode.equals(account1[count].getPin())){
                    System.out.println("First Name: " + account1[count].getFirstName());
                    System.out.println("Last Name: " + account1[count].getLastName());
                    System.out.println("Account Number: " + account1[count].getAccountNumber());
                    System.out.println("Balance: N" + account1[count].getBalance());
		}else{
		 System.out.println("Wrong Pin code try again");
		}
		break;

		// this might need to be put in outside for loop too cos deposit shouldoteedacoount once am log in 
                case 2:
                   // System.out.print("enter account number to deposit: ");
                   // String depositAccountNumber =  input.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount =  input.nextDouble();

                    //if (depositAccountNumber.equals(account1[count].getAccountNumber())) {
                        account1[count].deposit(depositAmount);
                   // }else {
                    //    System.out.println("invalid account number.");
                   // }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                        account1[count].withdraw(withdrawAmount);
                    break;

                case 4:
                  //  System.out.println("enter your pin number: ");
                   // String yourPin = input.nextLine();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = input.nextDouble();
			//remember to change this to the destination account not pin light comes back
                       account1[count].transfer(transferAmount);
			

                       break;
		case 5:
                    System.out.print("enter your old pin code: ");
                    String oldPin = input.nextLine();
		    if (oldPin.equals(account1[count].getPin())) {
		   System.out.print("enter your new pin code: ");
                    String newPin = input.nextLine(); 
		   account1[count].setPin(newPin);
		   account1[count].getPin() ;                 
                    System.out.println("password change succesfully");
                    }else{
                    System.out.println("wrong pin code");
		}
                    break;
		case 6:
		   counter++;
                    System.out.println("go back up to enter customer  number " + counter );
                    //main();
		
		break;
		case 7:
                    System.out.println("thanks for using our Atm. hope to see you again, ozuo!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
		
            }
        }
    }
}
}
