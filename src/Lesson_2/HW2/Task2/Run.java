package Lesson_2.HW2.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }
        ArrayList<String> result = doubleValues(list);
        System.out.println(list);
        System.out.println(result);
        for (String country : result) {
            System.out.println(country);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<>();
        for (String elem : list) {
            res.add(elem);
            res.add(elem);
        }
        return res;
    }
}
