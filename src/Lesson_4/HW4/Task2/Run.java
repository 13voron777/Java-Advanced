package Lesson_4.HW4.Task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        try {
            File file = new File("src\\Lesson_4\\HW4\\Task2\\task2_prep.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            while (reader.ready()) {
                StringBuilder str = new StringBuilder(reader.readLine());
                Pattern pattern = Pattern.compile("(on|under|to|of)");
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    String sub = matcher.group();
                    str.replace(str.indexOf(sub),
                            str.indexOf(sub) + sub.length(), "Java");
                }
                writer.write(str.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
