import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorAssertJTests {
    @Test
    public void sum_a10b_6_4(){
        final double expected = 4;

        final double actual = Calculator.sum(10,-6);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void divide_a10b0_IllegalArgumentException(){
        assertThatThrownBy(()->{Calculator.divide(10,0);})
                .hasMessageEndingWith("0");
    }
}
