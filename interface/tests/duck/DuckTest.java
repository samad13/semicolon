package duck;
import org.junit.jupiter.api.Test;


public class DuckTest {

    @Test
    public void test_that_duck_can_work_with_more_than_with_two_interface() {
        var quack1 = new Quack1();
        var fly3 = new Fly3();
        var duck= new Duck(quack1,fly3);
        duck.fly();
        duck.quack();


    }


}