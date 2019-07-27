import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculatorTests {
    private static double delta;

    @BeforeClass
    public static void setup(){
        delta = 0.001;
    }

    @AfterClass
    public static void tearDown(){
        delta = 0.0;
    }

    @Test
    public void sum_a7b13_20(){
        //Arrange
        final double expected = 20;

        //Act
        final double actual = Calculator.sum(7,13);

        //Assert
        Assert.assertEquals(expected,actual, delta);
    }

    @Test
    public void substraction_a5b_10_15(){
        final double expected = 15;

        final double actual = Calculator.substraction(5,-10);

        Assert.assertEquals(expected,actual, delta);
    }

    @Test
    public void multiply_a5b5_25(){
        final double expected = 25;

        final double actual = Calculator.multiply(5,5);

        Assert.assertEquals(expected,actual,delta);
    }

    @Test
    public void exception_test_byTryCatch(){
        try{
            Calculator.divide(10,0);
            System.out.println("nie rzucono wyjątku");
            Assert.fail();
        }
        catch (Exception e){
            System.out.println("Rzucono wyjątek");
            return;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_test_byExpectedAnnotation(){
        Calculator.divide(1,0);
    }

    @Rule
    public ExpectedException exceptionHandler = ExpectedException.none();

    @Test
    public void exception_test_byRule(){
        exceptionHandler.expect(IllegalArgumentException.class);
        Calculator.divide(1,0);
    }
}
