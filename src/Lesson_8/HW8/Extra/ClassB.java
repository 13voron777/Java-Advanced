package Lesson_8.HW8.Extra;

public class ClassB extends Thread {
    public static String classs = "Class";

    @Override
    public void run() {
        methodB1();
        methodB2();
    }

    public synchronized void methodB1() {
        System.out.println(classs + " B1");
    }

    public synchronized void methodB2() {
        System.out.println(classs + " B2");
    }
}
