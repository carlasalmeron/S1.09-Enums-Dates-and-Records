package level1.task1;

public class PrintDayType {

    public void printDayType (Day day) {
        if (day.isWeekend()) {
            System.out.println("It's weekend");
        } else {
            System.out.println("It's a working day");
        }
    }
}
