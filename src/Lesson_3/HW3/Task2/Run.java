package Lesson_3.HW3.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> map = getMap();
        String city = scanner.next();
        System.out.println(getFamily(map, city));
    }

    public static HashMap<String, String> getMap() {
        HashMap<String, String> res = new HashMap<>();
        while (true) {
            String city = scanner.next();
            if (city.equals(".")) {
                break;
            }
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
