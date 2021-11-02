package Lesson_2.LAB2.LR_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();

        while (true) {
            System.out.print("Введите число от 1 до 5 или 0 для выхода: ");
            int in = scanner.nextInt();
            if (in == 0) {
                break;
            } else {
                switch (in) {
                    case 1:
                        System.out.print("Введите логин нового пользователя: ");
                        String login = scanner.next();
                        System.out.print("Введите пароль пользователя " + login +  ": ");
                        String password = scanner.next();
                        users.put(login, password);
                        System.out.println("Пользователь добавлен!");
                        break;
                    case 2:
                        System.out.println("Введите логин пользователя: ");
                        String inLogin = scanner.next();
                        if (users.containsKey(inLogin)) {
                            users.remove(inLogin);
                            System.out.println("Пользователь удален!");
                        } else {
                            System.out.println("Пользователя не существует!");
                        }
                        break;
                    case 3:
                        System.out.println("Введите логин пользователя: ");
                        String checkLogin = scanner.next();
                        System.out.print("Пользователь с логином " + checkLogin);
                        if (users.containsKey(checkLogin)) {
                            System.out.println("присутствует!");
                        } else {
                            System.out.println("не существует!");
                        }
                        break;
                    case 4:
                        System.out.println("Введите логин пользователя: ");
                        String changeLogin = scanner.next();
                        if (users.containsKey(changeLogin)) {
                            System.out.println("Введите новый логин для пользователя " + changeLogin + ": ");
                            String newLogin = scanner.next();
                            String tempPassword = users.get(changeLogin);
                            users.remove(changeLogin);
                            users.put(newLogin, tempPassword);
                            System.out.println("Логин пользователя изменен!");
                        } else {
                            System.out.println("Пользователя не существует!");
                        }
                        break;
                    case 5:
                        System.out.println("Введите логин пользователя: ");
                        String changeLoginPas = scanner.next();
                        if (users.containsKey(changeLoginPas)) {
                            System.out.print("Введите новый пароль для пользователя " + changeLoginPas + ": ");
                            String newPassword = scanner.next();
                            users.put(changeLoginPas, newPassword);
                            System.out.println("Пароль пользователя изменен!");
                        } else {
                            System.out.println("Пользователя не существует!");
                        }
                        break;
                    default:
                        System.out.println("Неверный ввод!");
                        break;
                }
            }
        }
    }
}
