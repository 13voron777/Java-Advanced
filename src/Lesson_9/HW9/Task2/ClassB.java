package Lesson_9.HW9.Task2;

public class ClassB extends Thread {
    Thread thread1;

    @Override
    public void run() {
        System.out.println("ClassB started");
        try {
            sleep(2000);
            thread1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ClassB finished");
    }

    public void setThread1(Thread thread2) {
        this.thread1 = thread2;
    }
}
