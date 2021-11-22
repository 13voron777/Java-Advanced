package Lesson_9.HW9.Task2;

public class Run {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.setThread2(classB);
        classB.setThread1(classA);

        classA.start();
        classB.start();
    }
}
