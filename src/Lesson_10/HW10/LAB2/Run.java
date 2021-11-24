package Lesson_10.HW10.LAB2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Введите 10 чисел: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        list.stream().
                sorted(Collections.reverseOrder()).
                skip(5).
                forEach(i -> System.out.print(i + " "));
    }
}
