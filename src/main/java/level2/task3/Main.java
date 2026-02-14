package level2.task3;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {


        LocalDate date = LocalDate.of(2025, 5, 8);
        System.out.println("Original date: " + date);

        Period period = Period.of(2, 3, 5);

        LocalDate plusDate = date.plus(period);
        System.out.println("Date with added period: " + plusDate);

        LocalDate minusDate = date.minus(period);
        System.out.println("Date with subtracted period: " + minusDate);
    }
}
