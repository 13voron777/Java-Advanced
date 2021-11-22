package Lesson_9.HW9.Task3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassA extends Thread {
    Thread thread2;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        System.out.println("ClassA started");
        try {
            sleep(2000);
            if (thread2.isAlive()) {
                interrupt();
            }
            thread2.join();
            System.out.println("ClassA finished");
        } catch (Exception e) {
            System.out.println("ClassA interrupted");
        } finally {
            lock.unlock();
        }
    }

    public void setThread2(Thread thread2) {
        this.thread2 = thread2;
    }
}
