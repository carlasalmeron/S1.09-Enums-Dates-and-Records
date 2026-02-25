package level2.task6;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Appointment date1 = new Appointment(
                "Java Class",
                LocalDateTime.of(2026, 2, 9, 10, 30),
                LocalDateTime.of(2026, 2, 9, 12, 0)
        );

        Appointment date2 = new Appointment(
                "Dentist",
                LocalDateTime.of(2026, 2, 9, 13, 0),
                LocalDateTime.of(2026,2, 9, 14, 15)
        );

        agenda.addDate(date1);
        agenda.addDate(date2);

        System.out.println("--------24/02/2026--------");
        agenda.showDates();
    }
}
