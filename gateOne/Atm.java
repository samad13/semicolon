import java.util.Scanner;
import java.util.ArrayList;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
	ArrayList<Account> account1 = new ArrayList<>();
		


      
	int goodbye = 1;

	while(goodbye != 0){
          System.out.println("First Name: ");
	  String firstName = input.nextLine();
          System.out.println("Last Name: ");
	  String lastName = input.nextLine();
          System.out.println("Account Number: ");
	  String accountNumber = input.nextLine();
          System.out.println("enter account Balance: "); 
	  double balance = input.nextDouble();
	  input.nextLine();
	  System.out.println("enter your 4 digit pin: ");
	  String pin = input.nextLine();

	
	 account1.add(new Account(firstName,lastName, accountNumber,balance,  pin));


		
	int  choose =0;
	System.out.println("\nWelcome to GTB ATM Machine:");

	
	Account  currentAccount = null;
	int count = 0;

	 while (currentAccount ==  null) {
	System.out.println("enter your  acccount Number details:");
	String acccountNumber = input.nextLine();


       	System.out.println("enter pin to do transsactions and check your account details:");
	String enteredPin = input.nextLine();
 

	for (Account account : account1) {
                if (enteredPin.equals(account.getPin()) && acccountNumber.equals(account.getAccountNumber())) {
                    currentAccount = account;
             	 break;
                }
            }

		 if (currentAccount == null) {
                System.out.println("Wrong account number or PIN. Please try again.\n");
		count++;
		if(count == 3){
		 System.out.println("you entered wrong credentials 3 times you are been log out.\n");
		System.exit(0);
		}
                continue;
            }
		
            }
        while (choose!=  100) {
            System.out.println("\nWelcome Mr/Mrs " + currentAccount.getFirstName() + " " + currentAccount.getLastName() + "\n");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Change pin");
	    System.out.println("8.close account ");

	     System.out.println("0. Exit");


            choose =  input.nextInt();
	    input.nextLine();
		
	              switch (choose) {
                case 1:
                     System.out.println("First Name: " + currentAccount.getFirstName());
                        System.out.println("Last Name: " + currentAccount.getLastName());
                        System.out.println("Account Number: " + currentAccount.getAccountNumber());
                        System.out.println("Balance: N" + currentAccount.getBalance());
		break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount =  input.nextDouble();
                     currentAccount.deposit(depositAmount);
                break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = input.nextDouble();
                        input.nextLine();
                        currentAccount.withdraw(withdrawAmount);
                        
                    break;

                case 4:
                  System.out.println("enter your pin number: ");
                   String yourPin = input.nextLine();
			if(yourPin.equals(currentAccount.getPin())){

                    System.out.print("Enter transfer amount: ");
                    double transferAmount = input.nextDouble();
						input.nextLine();
		    System.out.print("which account number do you want to transfer to: ");
                    String depositAccountNumber =  input.nextLine();
			for (Account account : account1) {
				if(depositAccountNumber.equals(account.getAccountNumber()) && !depositAccountNumber.equals(currentAccount.getAccountNumber())){
			currentAccount.transfer(transferAmount, depositAccountNumber);
			
			 account.receieveTransfer(transferAmount);
				break;							
				}else {System.out.print("\nAccount number is wrong! \n");}

		}	
                        
				}else{
			System.out.print("\nYour pin code is wrong OLE! \n");

			}

                       break;
		case 5:
                        System.out.print("Enter your old PIN: ");

                        String oldPin = input.nextLine();

                        if (oldPin.equals(currentAccount.getPin())) {
                            System.out.print("Enter your new PIN: ");
                            String newPin = input.nextLine();
                            currentAccount.setPin(newPin);
                            System.out.println("PIN changed successfully.");
                        } else {
                            System.out.println("Wrong PIN code.");
                        }
                        break;
		case 8:
			 account1.remove(currentAccount);
			System.out.println("you have close your account: ");		

		case 0:
                    System.out.println("thanks for using our Atm. hope to see you again, ozuo!");
                    System.exit(0);
		case 100:
		System.out.println("this is for gtb bank staff only, enter your secret password to perform bank operations: ");

		String secretPassword = "WTF24";
		String staffPassword = input.nextLine();
		if( secretPassword.equals(staffPassword)){

 	String selectOption = """
            option 1: view all customers details:
            option 2: add a new customer details:
            option 3: search a particular customer details:
            option 4: close a particular customer details:
            option 0: EXIT THE SYSTEM:

           

        """;
		int  staff = 20;
        
		while(staff!= 2){
		System.out.println(selectOption);

		staff = input.nextInt();
		
		switch(staff){
			case 1:
		System.out.println("All Accounts:");
		for (Account account : account1) {
		 System.out.println("\nFirst Name: " + account.getFirstName()+ " Last Name: " +account.getLastName()
+" Account Number: " +account.getAccountNumber()+" Balance: N" +account.getBalance()+"\n");
         	   }
			break;
			case 2:
			 System.out.println("enter 0 to exit or any number to add another customer: ");		
			break;
			case 3:
			System.out.println("who do you want to search for: ");	
			System.out.println(" search by account number: ");
			String  accountNumba = input.next();
			for (Account account : account1) {
		
        		if(accountNumba.equals(account.getAccountNumber())){
			System.out.println("First Name: " + account.getFirstName()+ " Last Name: " +account.getLastName()
+" Account Number: " +account.getAccountNumber()+" Balance: N" +account.getBalance());
				}
			else{
				System.out.println("the account you search for doesnt exist: ");	
			}
			}
				
			break;
			case 4:
			System.out.println(" search by account number you want to close: ");
			String  deleteAccount = input.next();
			Account DELETE =null;
			for (Account account : account1) {
			if(deleteAccount.equals(account.getAccountNumber())){
				
			 DELETE  = account;
			System.out.println("the account has ben deleted: ");
				}else{System.out.println("the account you want to delete is not in our database: ");}

				}
			account1.remove(DELETE);
			break;
			case 0:
			System.out.println("......EXITING  THE MATRIX....: ");
			System.exit(0);
			break;

		}

		  		}
		}

		else {
		System.out.println("YOU ARE  NOT A STAFF,EXITING....: ");
		System.exit(0);
		}

		break;
		

                default:
                    System.out.println("Invalid option. Please try again.");
		
            }
        }
                
	goodbye = input.nextInt();
	input.nextLine();

    }System.out.println("goodbye dude or ladies!");
}
} 

