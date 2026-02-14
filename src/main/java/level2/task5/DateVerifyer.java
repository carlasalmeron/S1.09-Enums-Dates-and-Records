package level2.task5;

import java.time.LocalDate;

public class DateVerifyer {

    public static boolean isBeforeToday(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }
}
