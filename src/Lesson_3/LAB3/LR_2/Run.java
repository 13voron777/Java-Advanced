package Lesson_3.LAB3.LR_2;

import java.io.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к первому файлу: ");
        String filePath1 = scanner.next();
        System.out.print("Введите путь ко второму файлу: ");
        String filePath2 = scanner.next();
        System.out.print("Введите путь к третьему файлу: ");
        String filePath3 = scanner.next();

        File file1 = new File(filePath1);
        String inputFile1 = readerFile(file1);
        File file2 = new File(filePath2);
        String inputFile2 = readerFile(file2);

        File file3 = new File(filePath3);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file3));
        writer.write(inputFile1);
        writer.write(inputFile2);
        writer.close();
    }

    public static String readerFile(File file) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder res = new StringBuilder();
        while (true) {
            String temp = reader.readLine();
            if (temp == null) {
                break;
            } else {
                res.append(temp + "\n");
            }
        }
        reader.close();
        return res.toString();
    }
}
