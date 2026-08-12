/*
--> Date Time API main classes <--
1. LocalDate
--> methods <--
date.getYear();
date.getMonth();
date.getDayOfMonth();
date.getDayOfWeek();

2.LocalTime
--> methods <--
time.getHour();
time.getMinute();
time.getSecond();
time.getNano();

3.LocalDateTime

4.Instant (Instant ek machine-oriented timestamp represent karta hai, UTC timeline ke around)

5.Duration (Duration time-based amount represent karta hai)
--> methods <--
duration.toHours();
duration.toMinutes();
duration.toSeconds();

6.Period  (Period calendar-based amount represent karta hai)
--> methods <--
p.getYears();
p.getMonths();
p.getDays();

 */

import java.time.*;

public class _7_Date_Time_API {
    static void main(String[] args) {
        // --> LocalDate <--
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        // --> Custom LocalDate <--
        LocalDate custom = LocalDate.of(2026,7,10);
        System.out.println(custom);
        //LocalDate calculations
        System.out.println(date.plusDays(10));
        System.out.println(date.minusDays(10));
        System.out.println(date.plusYears(1));


        // --> LocalTime <--
        LocalTime time = LocalTime.now();
        System.out.println(time);
        //baki same se uppar jese but in time

        // --> LocalDateTime <--
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        //baki same se uppar jese but in time

        // --> Instant <--
        Instant now = Instant.now();
        System.out.println(now);

        // --> Duration <--
        Duration d = Duration.ofHours(2);
        System.out.println(d);
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);
        Duration duration = Duration.between(start, end);
        System.out.println(duration);

        // --> Period <--
        Period p = Period.of(2, 3, 10);
        System.out.println(p);
    }
}
