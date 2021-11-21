package Lesson_9.HW9.Extra;

public class Daemon extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i + " infinity");
        }
    }
}
