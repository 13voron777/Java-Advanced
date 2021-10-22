package Lesson_2.HW2.Task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        LinkedList<Integer> array = getIntegerList(n);
        System.out.println("Array: " + array);
        System.out.println("Minimum: " + getMinimum(array));
    }

    public static LinkedList<Integer> getIntegerList(int n) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            res.add(scanner.nextInt());
        }
        return res;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int elem : list) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }
}