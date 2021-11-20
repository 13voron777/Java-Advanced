package Lesson_8.HW8.Extra;

public class ClassA extends Thread {
    public static String classs = "Class";

    @Override
    public void run() {
        synchronized (this) {
            methodA1();
        }
        synchronized (this) {
            methodA2();
        }
    }

    public synchronized void methodA1() {
        System.out.println(classs + " A1");
    }

    public synchronized void methodA2() {
        System.out.println(classs + " A2");
    }
}
