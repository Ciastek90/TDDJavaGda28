import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
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
}
