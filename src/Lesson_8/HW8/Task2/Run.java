package Lesson_8.HW8.Task2;

public class Run {
    public static void main(String[] args) {
        Main main = new Main();
        First first = new First();
        Second second = new Second();

        try {
            main.start();
            first.start();
            second.start();

            main.join();
            first.join();
            second.join();

            if (!second.isAlive()) {
                System.out.println("End second");
            }
            if (!first.isAlive()) {
                System.out.println("End first");
            }
            if (!main.isAlive()) {
                System.out.println("End main");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
