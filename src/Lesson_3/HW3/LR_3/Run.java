package Lesson_3.HW3.LR_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        try {
            File file1 = new File("src\\Lesson_3\\HW3\\LR_3\\part.txt");
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
            for (int i = 0; i < 10; i++) {
                writer1.write((int) (Math.random() * 51) + " ");
            }
            writer1.close();
            File file2 = new File("src\\Lesson_3\\HW3\\LR_3\\part_sorted.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));
            List<Integer> list = new ArrayList<>();
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                for (String str : strings) {
                    list.add(Integer.parseInt(str));
                }
            }
            Collections.sort(list);
            for (int i : list) {
                writer2.write(i + " ");
            }
            reader.close();
            writer2.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}