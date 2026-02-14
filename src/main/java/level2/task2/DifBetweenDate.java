package level2.task2;

import java.time.LocalDate;
import java.time.Period;

public class DifBetweenDate {
    public static void main(String[] args) {

        LocalDate firstDate = LocalDate.of(2024, 5, 8);
        LocalDate lastDate = LocalDate.of(2026, 2, 9);

        Period period = Period.between(firstDate, lastDate);


        System.out.println("Difference between " + firstDate + " and " + lastDate);

        System.out.println("Days: " + period.getDays());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Years: " + period.getYears());
    }
}
