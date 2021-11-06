package Lesson_4.LAB4.LR_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) { //
        String str = "aa aba abba abbba abca abea";
        String[] words = str.split(" ");

        Pattern pattern = Pattern.compile("ab*a");
        for (String word : words) {
            Matcher m = pattern.matcher(word);
            if (m.matches()) {
                System.out.println(word);
            }
        }
    }
}
