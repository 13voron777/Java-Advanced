package Lesson_1.HW_1.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Run {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int elem = iterator.next();
            System.out.print(elem + " ");
        }
        System.out.println();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int elem = listIterator.next();
        }
        while (listIterator.hasPrevious()) {
            int elem = listIterator.previous();
            System.out.print(elem + " ");
        }
    }
}
