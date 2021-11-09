package Lesson_5.LAB5.LR_1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Run {
    public static void main(String[] args) {
        Class<?> cat = Cat.class;
        Cat cat1 = new Cat();

        System.out.println("Fields: ");
        Field[] fields = cat.getDeclaredFields();
        for (Field field : fields) {
            Class<?> type = field.getType();
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type name: " + type.getName() + "\n");
        }

        System.out.println("Modificators: ");
        int mods = cat.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.println("private");
        }
        if (Modifier.isProtected(mods)) {
            System.out.println("protected");
        }
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        System.out.println();

        System.out.println("Methods: ");



        //constants


        //constructors


        //superclasses


        System.out.println("Set and get by name: ");
        try {
            Field field1 = cat.getDeclaredField("name");
            field1.setAccessible(true);
            field1.set(cat1, "Tom");

            Field field12 = cat.getDeclaredField("age");
            field12.setAccessible(true);
            field12.setInt(cat1, 5);

            System.out.println("Name: " + field1.get(cat1));
            System.out.println("Age: " + field12.getInt(cat1));
            field1.setAccessible(false);
            field12.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


        //invoke sayMeow() by name
    }
}
