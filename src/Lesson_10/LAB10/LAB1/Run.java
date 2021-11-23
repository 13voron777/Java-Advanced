package Lesson_10.LAB10.LAB1;


public class Run {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int a2 = 2;
        int b2 = 3;

        Actions actions1 = (c) -> System.out.println(c + " is even: " + (c % 2 == 0));
        Actions actions2 = (d) -> System.out.println(d + " is odd: " + (d % 2 != 0));
        Range range = (e, c, d) -> System.out.println(e + " is between " + c + " and " + d + ": "
                + (e > c && e < d));
        Mult mult = (c, d) -> System.out.println(c + " divided by " + d + " clearly: " + (c % d == 0));

        actions1.print(a);
        actions1.print(b);
        //
        actions2.print(a);
        actions2.print(b);
        //
        range.print(a2, a, b);
        range.print(a, b2, b);
        //
        mult.print(b, a2);
        mult.print(b, b2);
    }
}
