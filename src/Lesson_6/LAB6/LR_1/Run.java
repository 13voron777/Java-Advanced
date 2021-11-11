package Lesson_6.LAB6.LR_1;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        File file = new File("src\\Lesson_6\\LAB6\\LR_1\\test.txt");
        Animal animal = new Animal("Wolf", 10, true);

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))) {
            os.writeObject(animal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
