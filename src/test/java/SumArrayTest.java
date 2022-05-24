import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    @Test
    public void testSumArrayHappyPathPositiveNumbers() {
        //1.Arrange
        // TestData: {0, 1, 2, 3, 4, 5} → 15
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //2.Act
        SumArray arSum = new SumArray();
        int actualResult = arSum.sumArray(array);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testSumArrayHappyPathNegativeNumbers() {
        //1.Arrange
        // TestData: {-7, -3} → -10
        int[] array = {-7, -3};
        int expectedResult = -10;

        //2.Act
        SumArray arSum = new SumArray();
        int actualResult = arSum.sumArray(array);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    public void testSumArrayEmptyArray() {
        //1.Arrange
        // TestData: {} → 0
        int[] array = {};
        int expectedResult = 0;

        //2.Act
        SumArray arSum = new SumArray();
        int actualResult = arSum.sumArray(array);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);


    }


}
