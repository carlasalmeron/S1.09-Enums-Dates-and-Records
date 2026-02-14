package level2.task6;

import java.time.LocalDateTime;

public class Date {
    String title;
    LocalDateTime start;
    LocalDateTime end;

    public Date(String title, LocalDateTime start, LocalDateTime end) {
        this.title = title;
        this.start = start;
        this.end = end;
    }
}
