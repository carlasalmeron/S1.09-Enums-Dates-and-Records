package level2.task6;

import java.time.LocalDateTime;

public class Appointment {
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;

    public Appointment(String title, LocalDateTime start, LocalDateTime end) {
        this.title = title;
        this.start = start;
        this.end = end;
    }

    public String getTitle() {
        return title;
    }
    public LocalDateTime getStart() {
        return start;
    }
    public LocalDateTime getEnd() {
        return end;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setEnd(LocalDateTime end) {
        if (end.isBefore(this.start)) {
            System.err.println("Error: End date cannot be before start date.");
        } else {
            this.end = end;
        }
    }
}
