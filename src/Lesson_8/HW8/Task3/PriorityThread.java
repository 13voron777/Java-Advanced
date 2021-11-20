package Lesson_8.HW8.Task3;

public class PriorityThread extends Thread {
    private String name;
    private static boolean isCompleted;

    public PriorityThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (!isCompleted) {
            isCompleted = true;
            print();
        }
    }

    public synchronized void print() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + this.name + " runner");
    }
}
