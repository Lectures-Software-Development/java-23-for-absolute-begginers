package data_types.wrapper_classes.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void runDateDemo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        IO.println("Today: " + simpleDateFormat.format(currentDate));

        // Deprecated since 1.1
        Date johnBirthDay = new Date(77, 9, 16);
        IO.println(johnBirthDay);

        int day = johnBirthDay.getDay();
        IO.println("Date: " + day);
        int month = johnBirthDay.getMonth();
        IO.println("Month: " + month);
        int year = johnBirthDay.getYear();
        System.out.println(year);

       /* try {
            Date johnBirthDay2 = simpleDateFormat.parse(String.valueOf(johnBirthDay));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
