package Lesson_3.LAB3.LR_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Run {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\Lesson_3\\LAB3\\LR_1\\LR_1_FILE");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (true) {
            String temp = reader.readLine();
            if (temp == null) {
                break;
            } else {
                System.out.println(temp);
            }
        }
        reader.close();
    }
}
