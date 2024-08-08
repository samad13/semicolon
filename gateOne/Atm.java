import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
	
	int goodbye = 1;

	while(goodbye != 0){
          System.out.println("First Name: ");
	  String firstName = input.nextLine();
          System.out.println("Last Name: ");
	  String lastName = input.nextLine();
          System.out.println("Account Number: ");
	  String accountNumber = input.nextLine();
          System.out.println(" input account Balance: "); 
	  double balance = input.nextDouble();
	  input.nextLine();
	  System.out.println("enter your 4 digit pin: ");
	  String pin = input.nextLine();

	
	
	var  account1 = new Account(firstName,lastName, accountNumber,balance,  pin);
		
	int  choose =0;
	System.out.println("\nWelcome to GTB ATM Machine:");

       	System.out.println("input pin to do transsactions and check your account details:");
	String pincode = input.nextLine();
	if(pincode.equals(account1.getPin())){
        while (choose!=  6) {
            System.out.println("\nWelcome Mr/Mrs "+firstName +" "+ lastName +"\n");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Change pin");
	    System.out.println("6.input another customer ");
	     System.out.println("0. Exit");


            choose =  input.nextInt();
	    input.nextLine();
		
	              switch (choose) {
                case 1:
                    System.out.println("First Name: " + account1.getFirstName());
                    System.out.println("Last Name: " + account1.getLastName());
                    System.out.println("Account Number: " + account1.getAccountNumber());
                    System.out.println("Balance: N" + account1.getBalance());
		break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount =  input.nextDouble();
                     account1.deposit(depositAmount);
                break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                        account1.withdraw(withdrawAmount);
                    break;

                case 4:
                   System.out.println("enter your pin number: ");
                   String yourPin = input.nextLine();
			if(yourPin.equals(account1.getPin())){

                    System.out.print("Enter transfer amount: ");
                    double transferAmount = input.nextDouble();
						input.nextLine();
		    System.out.print("which account number do you want to transfer to: ");
                    String depositAccountNumber =  input.nextLine();
                       account1.transfer(transferAmount,depositAccountNumber);
			}else{
			System.out.print("\nYour pin code is wrong OLE! \n");

			}

                       break;
		case 5:
                    System.out.print("enter your old pin code: ");
                    String oldPin = input.nextLine();
		    if (oldPin.equals(account1.getPin())) {
		   System.out.print("enter your new pin code: ");
                    String newPin = input.nextLine(); 
		   account1.setPin(newPin);
		   account1.getPin() ;                 
                    System.out.println("password change succesfully");
                    }else{
                    System.out.println("wrong pin code");
		}
                    break;
		case 6:
		    System.out.println("enter 0 to exit or any number to add another customer: ");		
		break;
		case 0:
                    System.out.println("thanks for using our Atm. hope to see you again, ozuo!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
		
            }
        }}else{
		 System.out.println("Wrong Pin code try again");
		}
	goodbye = input.nextInt();
	input.nextLine();

    }System.out.println("goodbye dude or ladies!");
}
} 

