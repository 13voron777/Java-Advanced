package Lesson_8.LAB8;

public class Run {
    public static void main(String[] args) {
        Thread runA = new Thread(new PrintRunnable("A .", 100));
        Thread runB = new Thread(new PrintRunnable(". B", 100));
        Thread runC = new Thread(new PrintRunnable(" C ", 100));

        runA.start();
        runB.start();
        try {
            runA.join();
            runB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====");
        runC.start();
    }
}
