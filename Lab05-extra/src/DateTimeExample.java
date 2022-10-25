import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today = " + today);
        LocalDate theDayAfter = today.plusDays(2);
        System.out.println("Day after tomorrow " + theDayAfter);

        LocalDate localDate = LocalDate.of(2016, Month.AUGUST, 23);

        System.out.println("Local Date = "+  localDate);

        LocalTime now = LocalTime.now();
        System.out.println("Local Time " + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate datr = LocalDate.parse("20/03/2022", format);



        System.out.println(datr);


        LocalDate localDate1 = LocalDate.of(2022,10,21);

        String format2 = localDate1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println(format2);


        String format3 = localDate1.format(DateTimeFormatter.ofPattern("EEE, MMM-dd-yyyy"));
        System.out.println(format3);

    }
}
