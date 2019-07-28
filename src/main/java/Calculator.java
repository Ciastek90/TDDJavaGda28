/**
 * Klasa do wykonywania działań matematycznych
 */
public final class Calculator {
    /**
     * @param numberA Pierwsza liczba wchodząca w skład działania
     * @param numberB Druga liczba wchodząca w skład działania
     * @return Suma dwóch liczb
     */
    public static double sum(double numberA, double numberB) {
        return numberA + numberB;
    }

    /**
     * @param numberA Pierwsza liczba wchodząca w skład działania
     * @param numberB Druga liczba wchodząca w skład działania
     * @return Różnica dwóch liczb
     */
    public static double substraction(double numberA, double numberB) {
        return numberA - numberB;
    }

    /**
     * @param multiplicand Mnożna
     * @param multiplier   Mnożnik
     * @return Iloczyn dwóch liczb
     */
    public static double multiply(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    /**
     * @param dividend Dzielna
     * @param divider  Dzielnik
     * @return Iloraz dwóch liczb
     */
    public static double divide(double dividend, double divider) {
        if (divider == 0.0) {
            throw new IllegalArgumentException("Ty cholero nie dziel przez 0");
        }

        return dividend / divider;
    }

    /**
     * @param n Identyfikator liczby fibonaciego
     * @return Liczba fibonaciego
     */
    public static int getFibonaciNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczby fibonaciego mozna obliczyć tylko z liczb dodatnich");
        }

        if (n <= 1) {
            return n;
        }

        return getFibonaciNumber(n - 1) + getFibonaciNumber(n - 2);
    }

    /*
    Metoda do obliczania logarytmu przy dowlonej podstawie
     */
    public static double log(int a, int b) {
        return Math.log(b) / Math.log(a);
    }

    public static double sqr(double a) {
        return a * a;
    }

    /*
    ta metoda służy do potęgowania przez przez n-ty wykładnik
     */
    public static double power(double a, double n) {
        return Math.pow(a, n);
    }

    /*
    ta metoda służy do wyciągania pierwiastka kwadratowego z liczby
     */
    public static double sqrt(double baseValue) {
        return Math.pow(baseValue, 0.5);
    }

    /*
    ta metoda służy do pierwiastkowania n-stopnia
     */
    public static double root(double valueBased, double step) {

        return Math.pow(valueBased, 1 / step);
    }

    /**
     * Metoda zwraca silnię z dowolnej liczby.
     *
     * @param n liczba na podstawie której obliczamy silnię
     * @return wynik działania silni
     */

    public static int factorial(int n) {
        final int baseFactorialResult = 1;
        final int factorialOffset = 1;

        return n >= baseFactorialResult ? factorial(n - factorialOffset) * n : baseFactorialResult;
    }
}
