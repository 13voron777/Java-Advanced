package Lesson_8.HW8.Task3;

public class Run {
    public static void main(String[] args) {
        PriorityThread max = new PriorityThread("max");
        max.setPriority(1);
        PriorityThread min = new PriorityThread("min");
        min.setPriority(3);
        Thread norm = new Thread(new PriorityRunner("norm"));
        norm.setPriority(2);

        min.start();
        norm.start();
        max.start();


    }
}
