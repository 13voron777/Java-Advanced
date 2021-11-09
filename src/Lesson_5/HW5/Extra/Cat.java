package Lesson_5.HW5.Extra;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        Class<?> classAnimal = Animal.class;
        try {
            Field field1 = classAnimal.getDeclaredField("name");
            Field field2 = classAnimal.getDeclaredField("age");
            Field field3 = classAnimal.getDeclaredField("sound");
            field1.setAccessible(true);
            field2.setAccessible(true);
            field3.setAccessible(true);

            field1.set(animal, "Cat");
            field2.setInt(animal, 5);
            field3.set(animal, "Meow!");
            field1.setAccessible(false);
            field2.setAccessible(false);
            field3.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(animal);
    }
}
