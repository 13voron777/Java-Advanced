package Lesson_5.LAB5.LR_1;

import java.lang.reflect.*;

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
            System.out.print("private");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("protected");
        }
        if (Modifier.isPublic(mods)) {
            System.out.print("public");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final");
        }
        System.out.println();

        System.out.println("Methods: ");
        Method[] methods = cat.getMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Method return type: " + method.getReturnType().getName() + "\n");
        }

        System.out.println("Constructors: ");
        Constructor[] constructors = cat.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
        }
        System.out.println();

        System.out.println("Superclasses: ");
        Class<?> superclass = cat.getSuperclass();
        System.out.println(superclass.getName() + "\n");

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
        System.out.println();

        System.out.println("Invoke sayMeow() by name");
        try {
            Method method = cat.getDeclaredMethod("sayMeow");
            method.setAccessible(true);
            method.invoke(cat1);
            method.setAccessible(false);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
