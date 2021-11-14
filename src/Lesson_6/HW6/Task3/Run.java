package Lesson_6.HW6.Task3;

public class Run {
    public static void main(String[] args) {
        getName(Car.class, BMW.class);
    }

    public static void getName(Class<?>... classes) {
        for (Class<?> cl : classes) {
            if (cl.isAnnotationPresent(DescCar.class)) {
                DescCar descCar = cl.getAnnotation(DescCar.class);
                System.out.println(descCar.name());
            }
        }
    }
}
