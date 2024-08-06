public class Account {

private String firstName;
private String lastName; 
private String accountNumber; 
private double balance;
private String pin;

public Account(String firstName, String lastName, String accountNumber, double balance, String pin) { 
this.firstName = firstName; 
this.lastName = lastName;
this.pin = pin;
this.accountNumber = accountNumber; 
if (balance > 0.0) {  
this.balance = balance; 
	} 
} 


public void setFirstName(String firstName) { 
 	 this.firstName = firstName;
	} 

	public  String getFirstName() { 
	 return firstName; 
	} 

	public void setLastName(String lastName) { 
 	this.lastName = lastName;
	} 

	public String getLastName() { 
	 return lastName; 
	} 
	

	public void setPin(String pin) { 
 	this.pin = pin;
	} 

	public String getPin() { 
	 return pin; 
	}
 
	public void setAccountNumber(String accountNumber) { 
 	 this.accountNumber = accountNumber;
	} 

	public  String getAccountNumber() { 
	 return accountNumber; 
	} 


	public double getBalance() { 
 	return balance; 
	} 


	public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("withdrawal amount exceeded account balance.");
        } else {
		System.out.print("you withdraw: " +  withdrawAmount);
            balance -= withdrawAmount;
	        System.out.println("   your blance is : " +   balance);

        }}

	public void deposit(double depositAmount) {
        if (depositAmount <= 0.0) {
            System.out.println("deposit amount is not valid, input a valid deposit");
        } else {
            balance += depositAmount;
        }
    }

	public void transfer(double transferAmount ) {
	    if ( transferAmount <= 0.0 ) {
            System.out.println("deposit amount is not valid, input a valid deposit");
        }  else if (transferAmount > this.balance) {
            System.out.println("transfer amount is more than account balance.");
        } else {
            balance -=  transferAmount; 
	  System.out.println("succesfull transfer your balance is: " + balance);

        }
    }

 



}