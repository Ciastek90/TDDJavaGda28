import data.CalculatorData;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTests {

    @Test
    @Parameters({"20, 30, 50", "100, 200, 300"})
    public void sum_parameterized(double numberA, double numberB, double expected){
        final double actual = Calculator.sum(numberA,numberB);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    @Parameters(method = "getData")
    @TestCaseName("index: {index} params: {params}")
    public void sum_parameterizedByMethod(double numberA, double numberB, double expected){
        final double actual = Calculator.sum(numberA,numberB);

        assertThat(expected).isEqualTo(actual);
    }

    private Object[] getData() {
        return new Object[]{
                new Object[]{10, 20, 30},
                new Object[]{20, 30, 50}
        };
    }

    @Test
    @Parameters(source = CalculatorData.class, method = "getData")
    public void sum_parameterizedByClass(double numberA, double numberB, double expected){
        final double actual = Calculator.sum(numberA, numberB);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    @Parameters(source = CalculatorData.class, method = "getFibonacci")
    public void getFibonacci_parametrized (int numberN,int expected){
        final int actual = Calculator.getFibonaciNumber(numberN);

        assertThat(expected).isEqualTo(actual);
    }
}
