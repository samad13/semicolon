package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Currency {

    public void testMultiplication() {
        Dollar five= new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
