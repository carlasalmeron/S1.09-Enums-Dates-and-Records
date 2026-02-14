package level2.task6;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Date> dates = new ArrayList<>();

    public void addDate(Date date) {
        dates.add(date);
    }

    public void showDates () {
        for (Date date : dates) {
            System.out.println(date.title);
            System.out.println("Start: " + date.start);
            System.out.println("End: " + date.end + "\n");
        }
    }
}
