package Lesson_8.HW8.Task3;

public class Run {
    public static void main(String[] args) {
        PriorityThread max = new PriorityThread("max");
        max.setPriority(Thread.MAX_PRIORITY);
        PriorityThread min = new PriorityThread("min");
        min.setPriority(Thread.MIN_PRIORITY);
        Thread norm = new Thread(new PriorityRunner("norm"));
        norm.setPriority(Thread.NORM_PRIORITY);
        Thread min2 = new Thread(new PriorityRunner("min2"));
        min2.setPriority(Thread.MIN_PRIORITY);

        min.start();
        max.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        norm.start();
        min2.start();
    }
}
