package Lesson_4.HW4.Extra;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter login: ");
            String login = scanner.next();
            Pattern pattern1 = Pattern.compile("[a-zA-Z]{5,20}");
            Matcher matcher1 = pattern1.matcher(login);
            if (!matcher1.matches()) {
                System.out.println("Failed login! Try again!");
                continue;
            }
            System.out.print("Enter password: ");
            String password = scanner.next();
            Pattern pattern2 = Pattern.compile("\\d{5,10}");
            Matcher matcher2 = pattern2.matcher(password);
            if (!matcher2.matches()) {
                System.out.println("Failed password! Try again!");
                continue;
            }
            System.out.println("Login successful!");
            break;
        }
    }
}
