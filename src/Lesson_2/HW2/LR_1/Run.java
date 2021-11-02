package Lesson_2.HW2.LR_1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Run {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(3, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getPriority() - o2.getPriority();
            }
        });

        priorityQueue.offer(new Person("Adam", 3));
        priorityQueue.offer(new Person("Ben", 1));
        priorityQueue.offer(new Person("Charlie", 5));
        priorityQueue.offer(new Person("David", 2));
        priorityQueue.offer(new Person("Filip", 4));

        while (priorityQueue.peek() != null) {
            System.out.println(priorityQueue.poll());
        }
    }
}
