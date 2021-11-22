package Lesson_9.HW9.Task2;

public class ClassA extends Thread {
    Thread thread2;

    @Override
    public void run() {
        System.out.println("ClassA started");
        try {
            sleep(2000);
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ClassA finished");
    }

    public void setThread2(Thread thread2) {
        this.thread2 = thread2;
    }
}
