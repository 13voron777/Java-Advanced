package Lesson_6.HW6.Task3;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface DescCar {
    String name();
}
