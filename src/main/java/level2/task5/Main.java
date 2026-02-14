package level2.task5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2024, 5, 8);
        LocalDate date2 = LocalDate.of(2026, 10, 2);

        boolean result1 = DateVerifyer.isBeforeToday(date1);
        boolean result2 = DateVerifyer.isBeforeToday(date2);

        System.out.println(date1 + " is before today?: " + result1);
        System.out.println(date2 + " is before today?: " + result2);
    }
}
