package Lesson_4.LAB4.LR_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            String subStr = m.group();
            System.out.println(subStr);
        }
    }
}
