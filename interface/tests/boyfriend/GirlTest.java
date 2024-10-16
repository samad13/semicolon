package boyfriend;

import org.junit.jupiter.api.Test;

public class GirlTest {

    @Test
    public void test_that_girl_need_a_boyfriend() {
       var yabaGuy = new YabaBoyfriend();
       var mushinGuy = new MushinBoyfriend();
       var lekkiGuy = new LekkiBoyfriend();
        var girlfriend = new Girl( yabaGuy);
        var girlfriend1 = new Girl(mushinGuy);
        var girlfriend2 = new Girl(lekkiGuy);
        girlfriend.last();
        girlfriend.care();
        girlfriend.spend();
        girlfriend1.last();
        girlfriend1.care();
        girlfriend1.spend();
        girlfriend2.last();
        girlfriend2.care();
        girlfriend2.spend();

    }

}
