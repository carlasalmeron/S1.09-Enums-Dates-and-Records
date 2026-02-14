package level1.task4;

public class Main {
    public static void main(String[] args) {

        Level level1 = StringToEnum.parseLevel("high");
        Level level2 = StringToEnum.parseLevel("Low");
        Level level3 = StringToEnum.parseLevel("Urgent");

        System.out.println(level1);
        System.out.println(level2);
        System.out.println(level3);
    }
}
