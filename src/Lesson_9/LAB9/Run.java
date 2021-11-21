package Lesson_9.LAB9;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Count min = new Count(arr, "min");
        Count max = new Count(arr, "max");
        min.start();
        max.start();
    }
}
