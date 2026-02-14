package level1.task2;

public class Task {
    public static void main(String[] args) {
        Level var = Level.HIGH;

        switch (var) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
