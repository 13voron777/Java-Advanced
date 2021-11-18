package Lesson_8.LAB8;

public class PrintRunnable implements Runnable {
    private String message;
    private int time;

    public PrintRunnable(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
