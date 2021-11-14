package Lesson_6.HW6.Task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) {
        Class<?> calc = Calculator.class;
        try {
            Method[] methods = calc.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(CalcParams.class)) {
                    CalcParams calcParams = method.getDeclaredAnnotation(CalcParams.class);
                    System.out.println(method.invoke(null, new Object[]{calcParams.a(), calcParams.b()}));
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
