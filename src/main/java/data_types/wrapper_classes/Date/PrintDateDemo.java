package data_types.wrapper_classes.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateDemo {
    public static void runPrintDateDemo() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date johnBirthDay = simpleDateFormat.parse("01/01/1980");
            IO.println("John's birthday: " + simpleDateFormat.format(johnBirthDay));

            // Day of the month
            int day = johnBirthDay.getDay();
            IO.println("Day: " + day);

            int month = johnBirthDay.getMonth();
            IO.println("Month: " + month);

            int year = johnBirthDay.getYear();
            IO.println("Year: " + year);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
