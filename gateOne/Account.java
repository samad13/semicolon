public class Account {

private String firstName;
private String lastName; 
private double balance;
private String pin;

public Account(String name, double balance,String firstName,  String lastName, String pin) { 
this.firstName = firstName; 
this.lastName = lastName;
this.pin = pin;
if (balance > 0.0) {  
this.balance = balance; 
	} 
} 

}