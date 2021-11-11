package Lesson_6.LAB6.LR_1;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int age;
    private boolean aggressive;

    public Animal(String name, int age, boolean aggressive) {
        this.name = name;
        this.age = age;
        this.aggressive = aggressive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = " + name + '\'' +
                ", age = " + age +
                ", aggressive = " + aggressive +
                '}';
    }
}
