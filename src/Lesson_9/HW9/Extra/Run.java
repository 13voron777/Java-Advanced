package Lesson_9.HW9.Extra;

public class Run {
    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        daemon.setDaemon(true);
        daemon.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
