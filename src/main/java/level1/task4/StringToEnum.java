package level1.task4;

public class StringToEnum {

    public static Level parseLevel(String value) {
        if (value == null) {
            return Level.UNKNOWN;
        }
        try {
            return Level.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid level: " + value + ". Returning UNKNOWN.");
            return Level.UNKNOWN;
        }
    }
}
