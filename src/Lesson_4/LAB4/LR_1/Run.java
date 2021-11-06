package Lesson_4.LAB4.LR_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        String str = "ahb acb aeb aeeb adcb axeb";
        String[] words = str.split(" ");

        Pattern pattern = Pattern.compile("a[hce]b");
        for (String word : words) {
            Matcher m = pattern.matcher(word);
            if (m.matches()) {
                System.out.println(word);
            }
        }
    }
}
