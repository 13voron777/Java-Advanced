package Lesson_3.HW3.Extra;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        try {
            File file = new File("src\\Lesson_3\\HW3\\Extra\\test.txt");
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
