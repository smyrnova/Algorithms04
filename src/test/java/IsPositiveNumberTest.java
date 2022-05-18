import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHappyPathPositiveValue() {
        // TestData: 555 →  true
        //A1
        int number = 555;
        boolean expectedResult = true;

        //A2
        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);

        //A3
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathNegativeValue() {
    // TestData: -555 →  false
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathZero() {
    // TestData: 0 →  true
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
