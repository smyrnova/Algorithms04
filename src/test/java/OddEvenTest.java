import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //для того чтоб ордер работал

public class OddEvenTest {
    OddEven odEv; //объявляем переменную, к-я будет использоваться в  @BeforeEach


    /**Запускается перед каждым тестомб выносим сюда что-то общее. Например создание объекта клсаа в котором лежит наш метод
     * как результат в каждом тесте не надо создавать объект.
     * напр.стр 58 "testOddEvenHappyPathOddPositiveNumbers"
     */

    @BeforeEach
    void setUp() {
        odEv = new OddEven();
    }

    @Order(1)
    @Test
    public void testOddEvenHappyPathEvenPositiveNumbers() {
        /** так как метод не static а вызвать его надо метод с другого класса надо создать обьект этого класса
         * тип данных объекта это название класса в котором находится нужный метод
         * в нашем случае класс OddEven
         */

        ///AAA

        //1.Arrange
        // TestData: 222222 →  “Even”
        long number = 222222;
        String expectedResult = "Even";

        //2.Act
        OddEven odEv = new OddEven();   //конструктор по умолчанию. Создается объект OddEven типа данных
        String actualResult = odEv.oddEven(number); //odEv - объект нужен только для того чтоб вызвать метод

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathOddPositiveNumbers() {
        //1.Arrange
        // TestData: 345 →  “Odd”
        long number = 345;
        String expectedResult = "Odd";

        //2.Act
        /**Объект создается в @BeforeEach и теперь от него мы толкьо вызывает метод
         */
        String actualResult = odEv.oddEven(number);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEvenNegativeNumbers() {
        //1.Arrange
        // TestData: -2147483648 →  “even”
        long number = -2147483648;
        String expectedResult = "Even";

        //2.Act
        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEven(number);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathOddNegativeNumbers() {
        //1.Arrange
        //TestData: -345 →  “Odd”
        long number = -345;
        String expectedResult = "Odd";

        //2.Act
        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEven(number);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddEvenHappyPathEvenZero() {
        //1.Arrange
        // TestData: 0 →  “Even”
        long number = 0;
        String expectedResult = "Even";

        //2.Act
        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEven(number);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenNegativeTestUndefined() {
        //1.Arrange
        //TestData:  2147483647 + 1 →  “Undefined”
        long number = 2147483648L;
        String expectedResult = "Undefined";

        //2.Act
        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEven(number);

        //3.Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
