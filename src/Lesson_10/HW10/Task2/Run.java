package Lesson_10.HW10.Task2;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("List: " + list);
        int res = list.stream().map(i -> i * i).reduce(0, Integer::sum);
        System.out.println("Sum of sqrs: " + res);
    }
}
