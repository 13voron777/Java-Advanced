package Lesson_4.HW4.Task3;

import java.time.*;

public class Run {
    public static void main(String[] args) {
        getDifference(LocalDateTime.of(1996, 7, 10, 8, 30, 0));
    }

    public static void getDifference(LocalDateTime localDateTime) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeToday = LocalDateTime.of(localDateTimeNow.getYear(),
                localDateTimeNow.getMonthValue(), localDateTimeNow.getDayOfMonth(),
                localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
        Period period = Period.between(localDateTime.toLocalDate(), localDateTimeNow.toLocalDate());
        boolean todayMoreNow = localDateTimeNow.getHour() < localDateTimeToday.getHour();
        Duration duration = todayMoreNow ? Duration.between(localDateTimeNow, localDateTimeToday) :
                Duration.between(localDateTimeToday, localDateTimeNow);
        long hours = todayMoreNow ? (23 - duration.getSeconds() / 3600) : (duration.getSeconds() / 3600);
        long minutes = todayMoreNow ? (59 - (duration.getSeconds() % 3600) / 60) :
                ((duration.getSeconds() % 3600) / 60);
        long seconds = todayMoreNow ? (59 - duration.getSeconds() % 60) : (duration.getSeconds() % 60);
        System.out.println("Вам исполнилось " + period.getYears() + " лет, "
                + period.getMonths() + " месяца, " + period.getDays() + " дней, "
                + hours + " часа, " + minutes + " минут и " + seconds + " секунд");
    }
}