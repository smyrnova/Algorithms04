import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {
    @Test
    public void testBiggerValuePositiveNumbers() {
        //test data: 3333, 9999
        int a = 3333;
        int b = 9999;
        int expectedResult = b;

        BiggerValue BV = new BiggerValue();
        int actualResult = BV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueNegativeNumbers() {
        //test data: -3333, -9999
        int a = -3333;
        int b = -9999;
        int expectedResult = a;

        BiggerValue BV = new BiggerValue();
        int actualResult = BV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueSameNumbers() {
        //test data: 3333, 3333
        int a = 3333;
        int b = 3333;
        int expectedResult = b;

        BiggerValue BV = new BiggerValue();
        int actualResult = BV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
