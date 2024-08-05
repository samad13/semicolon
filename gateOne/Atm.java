import java.util.Scanner;

public class Atm {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

var myAccount1 = new Account("john", 300.00);
var myAccount2 = new Account("jane", -70.9);


//System.out.println("Please enter the name:");

 //String theName = input.nextLine();
//String theName2 = input.nextLine();
//myAccount1.setName(theName);
//myAccount2.setName(theName2)
// System.out.println(); 
System.out.print("Enter withdraw any amount: "); 
double withd = input.nextDouble();
 myAccount1.withdraw(withd);
 myAccount2.withdraw(withd);

 System.out.printf("Name in object myAccount is:%n%s%n",myAccount1.getBalance());

 System.out.printf("Name in object myAccount is:%n%s%n",myAccount2.getBalance());


System.out.print("Enter deposit amount for account1: "); 
double depositAmount = input.nextDouble();
System.out.printf("%nadding to myAccount1 balance%n%n", depositAmount);
myAccount1.deposit(depositAmount); 

System.out.printf("%s balance: $%.2f %n", myAccount1.getName(), myAccount1.getBalance());
System.out.printf("%s balance: $%.2f %n%n", myAccount2.getName(), myAccount2.getBalance());

System.out.printf("%s balance: $ %n",myAccount1.getName(), myAccount1.getBalance()); 
 System.out.printf("%s balance: $ %n%n", myAccount2.getName(), myAccount2.getBalance());

System.out.printf("Name in object myAccount is:%n%s%n",myAccount1.getBalance());
 System.out.printf("Name in object myAccount is:%n%s%n",myAccount2.getBalance());

}
}