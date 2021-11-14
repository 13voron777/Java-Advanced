package Lesson_6.HW6.Extra;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) {
        Class<?> run = Run.class;
        try {
            Method[] methods = run.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().equals("mathSum")) {
                    if (method.isAnnotationPresent(Math.class)) {
                        Math math = method.getAnnotation(Math.class);
                        method.invoke(null, new Object[]{math.num1(), math.num2()});
                    }
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    @Math(num1 = 100, num2 = 200)
    public static void mathSum(int num1, int num2) {
        System.out.println("num1 + num2 = " + (num1 + num2));
    }
}
