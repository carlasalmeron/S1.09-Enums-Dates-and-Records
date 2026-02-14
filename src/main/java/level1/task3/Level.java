package level1.task3;

public enum Level {
    LOW,
    MEDIUM,
    HIGH;

    public String getColor() {
        switch (this) {
            case LOW:
                return "Green";
            case MEDIUM:
                return "Yellow";
            case HIGH:
                return "Red";
            default:
                return "Unknown";
        }
    }
}
