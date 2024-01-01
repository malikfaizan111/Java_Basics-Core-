package DateAndTimeLearning;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);
    }
}
