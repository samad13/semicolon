package bank;

import java.util.ArrayList;

public class Bank {
    private int numberOfAccounts = 0;
    ArrayList<Account> account1 = new ArrayList<>();
    Account newAccount;
    public void createAccountFor (String firstName,String lastName, String pin) {
         newAccount = new Account( firstName,lastName,pin,numberOfAccounts++);
        account1.add(newAccount);
    }


    public int countAccounts() {
        return numberOfAccounts;
    }


    public void depositFor(int accountNumber, int amount) {

        account1.get(accountNumber -1).deposit(amount);
    }

    public void withdrawFor(int accountNumber, int amount, String pin) {
        account1.get(accountNumber -1).withdraw(amount, pin);
    }

    public void transferFor(int accountNumber,  int amount, int accountNumberTo ,String pin  ) {
        account1.get(accountNumber -1).withdraw(amount,pin);
        account1.get(accountNumberTo-1).deposit(amount);
    }


    public int checkBalance(int accountNumber) {

        return  account1.get(accountNumber -1).getBalance("pin");
    }



    public void userAccountNumber(int accountNumber, String pin) {
         account1.remove(accountNumber - 1);
        numberOfAccounts = account1.size();
        }
    }




