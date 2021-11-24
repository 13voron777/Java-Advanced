package Lesson_10.HW10.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        Calculator calculator1 = (c, d) -> System.out.println(c + " + " + d + " = " + (c + d));
        Calculator calculator2 = (c, d) -> System.out.println(c + " - " + d + " = " + (c - d));
        Calculator calculator3 = (c, d) -> System.out.println(c + " * " + d + " = " + (c * d));
        Calculator calculator4 = (c, d) -> System.out.println(c + " / " + d + " = " + (c / d));
        Calculator calculator5 = (c, d) -> System.out.println(c + " % " + d + " = " + (c % d));

        List<Calculator> calculatorList = new ArrayList<>(Arrays.asList(calculator1, calculator2,
                calculator3, calculator4, calculator5));
        calculatorList.forEach(calculator -> calculator.print(a, b));
    }
}
