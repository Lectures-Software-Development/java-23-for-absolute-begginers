package data_types.wrapper_classes.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class NewCalendarDateDemo {
    public static void runNewCalendarDateDemo() {
        var currentTime = LocalDateTime.now();
        System.out.println("currentTime: " + currentTime);

        LocalDate today = currentTime.toLocalDate();
        System.out.println("today: " + today);

        var johnBD = LocalDate.of(1990, Month.JANUARY, 7);
        System.out.println("johnBD: " + johnBD);

        var day = johnBD.getDayOfWeek();
        System.out.println("day: " + day);

        var month = johnBD.getMonth();
        System.out.println("month: " + month);

        var year = johnBD.getYear();
        System.out.println("year: " + year);
        IO.println("year: " + year);

        IO.println("**********************************");
        IO.println(currentTime.toString());

        IO.println(LocalDateTime.of(
            2024,
            Month.JUNE,
            15,
            10,
            30
        ).toString());
        IO.println("**********************************");
    }
}
