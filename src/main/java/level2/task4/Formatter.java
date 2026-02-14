package level2.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        System.out.println("Before formatting: " + "\n" + date + "\n");

        DateTimeFormatter firstDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter secondDateFormat = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter thirdDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH");

        String formattedDate1 = date.format(firstDateFormat);
        String formattedDate2 = date.format(secondDateFormat);
        String formattedDate3 = date.format(thirdDateFormat);

        System.out.println("After formatting: " + "\n" +
                formattedDate1 + "\n" +
                formattedDate2 + "\n" +
                formattedDate3);
    }
}
