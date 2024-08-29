package bank;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int accountNumber;

    public Account(String firstName, String lastName ,String pin, int accountNumber) {
        this.name = firstName +" "+ lastName;
        this.balance = 0;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }


    public int getBalance(String pin) {
        if (isCorrectPin(pin))
            return balance;
        throw new IllegalArgumentException("invalid pin");
    }

    public void deposit(int amount) {
        boolean isHigherThanZero = amount > 0;
        if(isHigherThanZero) balance += amount;

    }

    public void withdraw(int amount,String pin) {
        boolean isHigherThanZero = amount > 0;
        boolean isLowerThanBalance = amount < balance;
        if(isHigherThanZero && isLowerThanBalance) balance -= amount;
            else throw new IllegalArgumentException("insufficient balance");
    }

    private boolean isCorrectPin(String pin){
        return this.pin.equals(pin);
    }

    public String getPin() {
        return pin;
    }
    public void update(String oldpin, String newPin) {
        if(isCorrectPin(oldpin))
        {this.pin =  newPin;
            } else {
        throw new IllegalArgumentException("Invalid old pin");
    }
    }
}

