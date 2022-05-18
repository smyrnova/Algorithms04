import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    /**
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */
    @Order(1)
    @Test
    public void testOddIndicesHappyPath() {
        //TestData: {-45, 590, 234, 985, 12, 68}
        //Expected Result =  {590, 985, 68}
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oI = new OddIndices();
        int[] actualResult = oI.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEmptyArray() {
        //TestData: {}
        //Expected Result =  {}
        int[] array = {};
        int[] expectedResult = {};

        OddIndices oI = new OddIndices();
        int[] actualResult = oI.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
