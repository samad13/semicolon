package multidimention;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DimentionTest {
    @Test
    public void test_If_Array_Contain_Asterisks_And_Spaces() {
        var dimention = new Dimention();
        int[][] array = {{1, 1, 0}, {0, 1, 0}, {1, 1, 0}};
        String[][] result = {{"*", "*", " "}, {" ", "*", " "}, {"*", "*", " "}};
        assertArrayEquals(result, dimention.getResult(array));

    }

}