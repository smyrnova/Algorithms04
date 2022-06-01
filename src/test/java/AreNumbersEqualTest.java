import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {
    /**
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */
    @Test
    public void testAreNumbersEqualNumbersEqual() {
        //Test Data:89, 89 Expected result: 0
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ANE = new AreNumbersEqual();
        int actualResult = ANE.AreNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testAreNumbersEqualBisBiggerThanA() {
        //-89, 89 Expected result: -1
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual ANE = new AreNumbersEqual();
        int actualResult = ANE.AreNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testAreNumbersEqualAisBiggerThanB() {
        //89, -89 Expected result: 1
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual ANE = new AreNumbersEqual();
        int actualResult = ANE.AreNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);


    }


}
