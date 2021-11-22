package Lesson_9.HW9.Task3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassB extends Thread {
    Thread thread1;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        System.out.println("ClassB started");
        try {
            sleep(2000);
            if (thread1.isAlive()) {
                interrupt();
            }
            thread1.join();
            System.out.println("ClassB finished");
        } catch (Exception e) {
            System.out.println("ClassB interrupted");
        } finally {
            lock.unlock();
        }
    }

    public void setThread1(Thread thread2) {
        this.thread1 = thread2;
    }
}
