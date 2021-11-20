package Lesson_8.HW8.Extra;

public class ClassB extends Thread {
    public static String classs = "Class";

    @Override
    public void run() {
        try {
            methodB1();
            Thread.sleep(3000);
            methodB2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB1() {
        System.out.println(classs + " B1");
    }

    public synchronized void methodB2() {
        System.out.println(classs + " B2");
    }
}
