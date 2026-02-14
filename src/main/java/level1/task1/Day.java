package level1.task1;

public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WENDSDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean weekend;

    Day(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
