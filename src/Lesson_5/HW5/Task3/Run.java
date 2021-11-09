package Lesson_5.HW5.Task3;

import java.lang.reflect.*;

public class Run {
    public static void main(String[] args) {
        Class<?> plane = Plane.class;

        System.out.println("Fields: ");
        Field[] fields = plane.getDeclaredFields();
        int i = 1;
        for (Field field : fields) {
            Class<?> type = field.getType();
            System.out.println(i + " Field name: " + field.getName());
            System.out.println(i + " Field type name: " + type.getName());
            i++;
        }
        System.out.println();

        System.out.println("Modificators: ");
        int mods = plane.getModifiers();
        System.out.print("Class Plane modificators: ");
        defineModificators(mods);
        System.out.println("Fields modificators: ");
        for (Field field : fields) {
            int modsFields = field.getModifiers();
            System.out.print("Field " + field.getName() + ": ");
            defineModificators(modsFields);
        }
        Method[] methods = plane.getMethods();
        for (Method method : methods) {
            int modsMethods = method.getModifiers();
            System.out.print("Method " + method.getName() + ": ");
            defineModificators(modsMethods);
        }
        Constructor[] constructors = plane.getConstructors();
        i = 1;
        for (Constructor constructor : constructors) {
            int modsConstructor = constructor.getModifiers();
            System.out.print("Constructor " + (i++) + ": ");
            defineModificators(modsConstructor);
        }
        System.out.println();

        System.out.println("Methods: ");
        i = 1;
        for (Method method : methods) {
            System.out.println(i + " Method name: " + method.getName());
            System.out.println(i + " Method return type: " + method.getReturnType().getName());
            i++;
        }
        System.out.println();

        System.out.println("Constructors: ");
        i = 1;
        for (Constructor constructor : constructors) {
            System.out.println((i++) + " Constructor parameters: ");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
        }
    }

    public static void defineModificators(int mods) {
        if (Modifier.isPrivate(mods)) {
            System.out.print("private");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("protected");
        }
        if (Modifier.isPublic(mods)) {
            System.out.print("public");
        }
        System.out.println();
    }
}
