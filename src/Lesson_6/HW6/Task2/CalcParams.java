package Lesson_6.HW6.Task2;

import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface CalcParams {
    double a();
    double b();
}
