package DateAndTimeLearning;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateFormattier {
 public static void main(String[] args) {
      LocalDateTime loc = LocalDateTime.now();
    ZonedDateTime dt = ZonedDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss z");

    System.out.println(df.format(dt));
        System.out.println(loc.get(ChronoField.YEAR));
 }   
}
