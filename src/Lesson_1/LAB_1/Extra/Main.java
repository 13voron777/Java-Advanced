package Lesson_1.LAB_1.Extra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);
        Animal bird1 = new Animal("King Penguim", 15, 8, 50000);
        Animal bird2 = new Animal("King Penguin", 15, 8, 40000);
        Animal bird3 = new Animal("King Penguin", 14, 8, 50000);
        Animal bird4 = new Animal("King Penguin", 14, 7, 50000);

        Animal[] c = {cat, dog, bird, bird1, bird2, bird3, bird4};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
