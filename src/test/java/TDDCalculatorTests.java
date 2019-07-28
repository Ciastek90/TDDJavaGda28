import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TDDCalculatorTests {
    @Test
    public void log_a2b4_2(){
        final double expected = 2;

        final double actual = Calculator.log(2,4);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void square_2sqr2_4() {
        final double expected = 4;

        final double actual = Calculator.sqr(2);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void power_a2n3_8(){
        final double expected = 8;

        final double actual = Calculator.power(2,3);

        assertThat(expected).isEqualTo(actual);

    }
    @Test
    public void sqrt_baseValue9_3(){
        final double expected = 3;

        final double actual = Calculator.sqrt(9);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void root_baseValue8step3_2(){
        final double expected = 2;

        final double actual = Calculator.root(8,3);
        assertThat(expected).isEqualTo(actual);

    }
    @Test
    public void factorial_a5_120(){
        final double expected = 120;

        final double actual = Calculator.factorial(5);
        assertThat(expected).isEqualTo(actual);
    }
}
