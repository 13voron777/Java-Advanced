package Lesson_8.HW8.Task3;

public class PriorityRunner implements Runnable {
    private String name;

    public PriorityRunner(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + this.name);
    }
}
