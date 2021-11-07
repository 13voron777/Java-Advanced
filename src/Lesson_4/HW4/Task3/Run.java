package Lesson_4.HW4.Task3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Run {
    public static void main(String[] args) {
        //System.out.println(LocalDate.of(1999, 4, 19).getMonth().getValue());
        getTime(LocalDate.of(1996, 11, 10), LocalTime.of(8, 30, 0));
    }

    public static void getTime(LocalDate localDate, LocalTime localTime) {
        LocalDate localDateNow = LocalDate.now();
        LocalTime localTimeNow = LocalTime.now();
        long years = localDateNow.getYear() - localDate.getYear();
        long months = localDateNow.getMonth().getValue() - localDate.getMonth().getValue();
        long days = localDateNow.getDayOfMonth() - localDate.getDayOfMonth();
        long hours = localTimeNow.getHour() - localTime.getHour();
        long minutes = localTimeNow.getMinute() - localTime.getMinute();
        long seconds = localTimeNow.getSecond() - localTime.getSecond();
        System.out.println("Вам исполнилось " + years +
                " лет, " + months +
                " месяца, " + days +
                " дней, " + hours +
                " часа, " + minutes +
                " минут и " + seconds +
                " секунд");
    }
}