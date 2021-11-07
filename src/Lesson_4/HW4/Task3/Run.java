package Lesson_4.HW4.Task3;

import java.time.Duration;
import java.time.LocalDateTime;

public class Run {
    public static void main(String[] args) {
        getTime(LocalDateTime.of(1996, 7, 10, 8, 30, 0));
    }

    public static void getTime(LocalDateTime localDateTime1) {
        LocalDateTime localDateTime2 = LocalDateTime.now();
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        long seconds = duration.getSeconds();
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long months = days / 30;
        long years = months / 12;
        System.out.println("Вам исполнилось " + years +
                " лет, " + (months - years * 12) +
                " месяца, " + (days - years * 12 * 30) +
                " дней, " + (hours - years * 12 * 30 * 24) +
                " часа, " + (minutes - years * 12 * 30 * 24 * 60) +
                " минут и " + (seconds - years * 12 * 30 * 24 * 60 * 60) +
                " секунд");
    }
}