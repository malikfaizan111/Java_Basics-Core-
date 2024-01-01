package DateAndTimeLearning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class JodaDateTime {
    public static void main(String[] args) {
        // Date d = new Date();
        // d.setHours(21);// mutabble
        // System.out.println(d);

        // LocalDate dt = LocalDate.now();
        // LocalDate dt = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        // LocalDate dt = LocalDate.of(2020,Month.MARCH,10);
        // LocalDate dt = LocalDate.ofEpochDay(1000);
        LocalDate dt = LocalDate.parse("2020-04-15");
        LocalDate dt1 = dt.plusMonths(6);
        System.out.println(dt1);


        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t1 = t.minusHours(3);
        System.out.println(t1);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
