package level2.task6;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Appointment> dates = new ArrayList<>();

    public void addDate(Appointment date) {
        if (date != null) {
            dates.add(date);
        }
    }

    public void showDates() {
        if (dates.isEmpty()) {
            System.out.println("The agenda is empty.");
            return;
        }
        for (Appointment app : dates) {
            System.out.println("Event: " + app.getTitle());
            System.out.println("Start: " + app.getStart());
            System.out.println("End: " + app.getEnd() + "\n");
        }
    }
}
