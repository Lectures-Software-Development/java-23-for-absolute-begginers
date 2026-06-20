package data_types.wrapper_classes.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDateDemo {
    public static void runCalendarDateDemo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/dd");
        Calendar calendar = new GregorianCalendar();
        Date currentDate = calendar.getTime();
        IO.println("Today: " + simpleDateFormat.format(currentDate));

        calendar.set(1985, Calendar.MAY, 21);
        Date johnBirthDay = calendar.getTime();
        IO.println("John's birthday: " + simpleDateFormat.format(johnBirthDay));

        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int month = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        IO.println("Day: " + day + ", Month: " + month + ", Year: " + year);
    }
}
