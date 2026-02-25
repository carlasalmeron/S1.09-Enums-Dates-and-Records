package level1.task4;

public class Main {
    public static void main(String[] args) {

        Level level1 = StringToEnum.parseLevel("high");
        Level level2 = StringToEnum.parseLevel("Low");
        Level level3 = StringToEnum.parseLevel("Urgent");

        System.out.println("Result 1: " + level1);
        System.out.println("Result 2: " + level2);
        System.out.println("Result 3: " + level3);

        if (level3 == Level.UNKNOWN) {
            System.out.println("Be careful, level 3 was not valid.");
        }
    }
}
