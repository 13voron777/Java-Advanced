package Lesson_2.HW2.LR_1;

public class Person {
    private String name;
    private int priority;

    public Person(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "name = " + name  + ", priority = " + priority;
    }
}
