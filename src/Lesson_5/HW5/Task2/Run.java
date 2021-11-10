package Lesson_5.HW5.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Class<?> arrayListClass = ArrayList.class;
        System.out.println("Class information:");
        System.out.println("Name: " + arrayListClass.getName());
        System.out.println("SimpleName: " + arrayListClass.getSimpleName());
        System.out.println("Is interface? " + arrayListClass.isInterface());
        System.out.println("Package name: " + arrayListClass.getPackageName() + "\n");

        System.out.println("Fields: ");
        Field[] fields = arrayListClass.getDeclaredFields();
        int i = 1;
        for (Field field : fields) {
            Class<?> type = field.getType();
            System.out.println(i + " Field name: " + field.getName());
            System.out.println(i + " Field type name: " + type.getName());
            i++;
        }
        System.out.println();

        System.out.println("Modificators: ");
        int mods = arrayListClass.getModifiers();
        System.out.print("Class Plane modificators: ");
        defineModificators(mods);
        System.out.println("Fields modificators: ");
        for (Field field : fields) {
            int modsFields = field.getModifiers();
            System.out.print("Field " + field.getName() + ": ");
            defineModificators(modsFields);
        }
        Method[] methods = arrayListClass.getMethods();
        System.out.println("Methods modificators: ");
        for (Method method : methods) {
            int modsMethods = method.getModifiers();
            System.out.print("Method " + method.getName() + ": ");
            defineModificators(modsMethods);
        }
        Constructor[] constructors = arrayListClass.getConstructors();
        System.out.println("Constructors modificators: ");
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
            int j = 1;
            for (Class<?> paramType : paramTypes) {
                System.out.println((j++) + " Param: " + paramType.getName());
            }
        }
    }

    public static void defineModificators(int mods) {
        if (Modifier.isInterface(mods)) {
            System.out.print("interface ");
        }
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("protected ");
        }
        if (Modifier.isPublic(mods)) {
            System.out.print("public ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        System.out.println();
    }
}
