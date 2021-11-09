package Lesson_5.HW5.Extra;

public class Animal {
    private String name;
    protected int age;
    public String sound;

    @Override
    public String toString() {
        return "Animal{" +
                "name = " + name +
                ", age = " + age +
                ", sound = " + sound +
                '}';
    }
}
