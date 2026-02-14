package level1.task4;

public class StringToEnum {

    public static Level parseLevel(String value) {
        try {
            return Level.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid level: " + value + "\n");
            return null;
        }
    }
}
