package Lesson_3.HW3.Task2;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        try {
            File file = new File("src\\Lesson_3\\HW3\\Task2\\test2.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("test task2 information");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
