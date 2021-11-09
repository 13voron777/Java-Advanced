package Lesson_5.LAB5.LR_1;

public class Cat {
    private String name;
    private int age;

    private void sayMeow() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = " + name +
                ", age = " + age +
                '}';
    }
}
