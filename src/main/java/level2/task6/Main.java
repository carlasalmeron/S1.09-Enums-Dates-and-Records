package level2.task6;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Date date1 = new Date(
                "Java Class",
                LocalDateTime.of(2026, 2, 9, 10, 30),
                LocalDateTime.of(2026, 2, 9, 12, 0)
        );

        Date date2 = new Date(
                "Dentist",
                LocalDateTime.of(2026, 2, 9, 13, 0),
                LocalDateTime.of(2026,2, 9, 14, 15)
        );

        agenda.addDate(date1);
        agenda.addDate(date2);

        System.out.println("--------09/02/2026--------");
        agenda.showDates();
    }
}
