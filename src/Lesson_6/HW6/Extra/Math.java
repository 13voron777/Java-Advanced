package Lesson_6.HW6.Extra;

import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Math {
    int num1();
    int num2();
}
