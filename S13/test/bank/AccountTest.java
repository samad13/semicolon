package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;
    private final String correctPin = "pin";
    @BeforeEach
    public void startAllWithThis(){

         account = new Account("dayo","yusuf" ,correctPin, 0);


    }

    @Test
    public void  newAccount_balanceIsZeroTest(){

        assertEquals(0, account.getBalance(correctPin));
    }

    @Test
    public void deposit7kAnd2k_balanceIs10kTest(){
        account.deposit(7_000);
       assertEquals(7_000, account.getBalance(correctPin));
        account.deposit(3_000);
        assertEquals(10_000, account.getBalance(correctPin));

    }
    @Test
    public void  newAccount_depositNegativeMoneyTest(){
        account.deposit(2000);
       assertEquals(2000, account.getBalance(correctPin));
       account.deposit(-5000);
        assertEquals(2000, account.getBalance(correctPin));
    }
    @Test
    public void newAccount_withdrawMoneyTest(){
        account.deposit(10000);
        assertEquals(10_000, account.getBalance(correctPin));
        account.withdraw(5_000, correctPin);
        assertEquals(5_000, account.getBalance(correctPin));
    }

    @Test
    public void newAccount_withdrawMoneyNegativeTest(){
        account.deposit(10000);
        assertEquals(10_000, account.getBalance(correctPin));
        //account.withdraw(-5_000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5_000,correctPin));
        assertEquals(10_000, account.getBalance(correctPin));
    }

    @Test
    public void newAccount_updatePinTest() {
        account.update(correctPin, "newPin");
        assertEquals(0, account.getBalance("newPin"));
        assertThrows(IllegalArgumentException.class, () -> account.getBalance(correctPin));
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("newPin"));
    }


}













