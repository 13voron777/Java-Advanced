package Lesson_6.HW6.Task3;

@SuppressWarnings({"Attention, BMW!"})
public class BMW extends Car {
    @Override
    public void stand() {
        System.out.println("BMW stands");
    }

    @Deprecated
    public void go() {
        System.out.println("go!");
    }
}
