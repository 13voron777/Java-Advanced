package Lesson_6.HW6.Task2;


public class Calculator {
    /**
     *
     * @param a parameter a
     * @param b parameter b
     * @return a + b
     */
    @CalcParams(a = 15, b = 5)
    public static double sum(double a, double b) {
        System.out.print(a + " + " + b + " = ");
        return a + b;
    }

    /**
     *
     * @param a parameter a
     * @param b parameter b
     * @return a - b
     */
    @CalcParams(a = 12, b = 7)
    public static double diff(double a, double b) {
        System.out.print(a + " - " + b + " = ");
        return a - b;
    }

    /**
     *
     * @param a parameter a
     * @param b parameter b
     * @return a * b
     */
    @CalcParams(a = 24, b = 3)
    public static double mult(double a, double b) {
        System.out.print(a + " * " + b + " = ");
        return a * b;
    }

    /**
     *
     * @param a parameter a
     * @param b parameter b
     * @return a / b
     */
    @CalcParams(a = 16, b = 4)
    public static double div(double a, double b) {
        System.out.print(a + " / " + b + " = ");
        return a / b;
    }

    /**
     *
     * @param a parameter a
     * @param b parameter b
     * @return a % b
     */
    @CalcParams(a = 24, b = 5)
    public static double mod(double a, double b) {
        System.out.print(a + " % " + b + " = ");
        return a % b;
    }
}
