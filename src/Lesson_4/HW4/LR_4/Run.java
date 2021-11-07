package Lesson_4.HW4.LR_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        System.out.println("Welcome!");
        while (true) {
            System.out.println("Press 1 to add new User\nPress 2 to print list of users\nPress 0 to exit");
            String in = scanner.nextLine();
            if (in.equals("0")) {
                break;
            }
            switch (in) {
                case "1":
                    String login;
                    String phone;
                    String email;
                    while (true) {
                        System.out.print("Enter login: ");
                        login = scanner.nextLine();
                        Pattern pl = Pattern.compile("[a-zA-Z]{1,10}");
                        Matcher ml = pl.matcher(login);
                        if (!ml.matches()) {
                            System.out.println("Wrong login! Try again!");
                            continue;
                        }
                        break;
                    }
                    while (true) {
                        System.out.print("Enter phone: ");
                        phone = scanner.nextLine();
                        Pattern pp = Pattern.compile("\\+38\\(098\\)\\d{2}[\\s-]\\d{2}[\\s-]\\d{3}");
                        Matcher mp = pp.matcher(phone);
                        if (!mp.matches()) {
                            System.out.println("Wrong phone! Try again!");
                            continue;
                        }
                        break;
                    }
                    while (true) {
                        System.out.print("Enter email: ");
                        email = scanner.nextLine();
                        Pattern pe = Pattern.compile("\\w{2,15}@(gmail.com|yandex.ru|mail.ru|yahoo.com)");
                        Matcher me = pe.matcher(email);
                        if (!me.matches()) {
                            System.out.println("Wrong email! Try again!");
                            continue;
                        }
                        break;
                    }
                    users.add(new User(login, phone, email));
                    System.out.println();
                    break;
                case "2":
                    for (User user : users) {
                        System.out.println(user);
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}
