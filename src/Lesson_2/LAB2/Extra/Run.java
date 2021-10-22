package Lesson_2.LAB2.Extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        String string;
        while (true) {
            string = scanner.next();
            if (string.equals("end")) {
                break;
            } else {
                arrayList.add(string);
            }
        }

        System.out.println(arrayList);
        for (String elem : arrayList) {
            System.out.println(elem);
        }
    }
}
