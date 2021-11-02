package Lesson_2.HW2.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> map = getMap();
        System.out.print("Введите город: ");
        String city = scanner.next();
        System.out.println("Семья для города " + city + ": " + getFamily(map, city));
    }

    public static HashMap<String, String> getMap() {
        HashMap<String, String> res = new HashMap<>();
        while (true) {
            System.out.print("Введите город: (или . для выхода): ");
            String city = scanner.next();
            if (city.equals(".")) {
                break;
            }
            System.out.print("Введите семью: ");
            String family = scanner.next();
            res.put(city, family);
        }
        return res;
    }

    public static String getFamily(HashMap<String, String> map, String city) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(city)) {
                return pair.getValue();
            }
        }
        return null;
    }
}
