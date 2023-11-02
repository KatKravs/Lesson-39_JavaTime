package ait.time.utis;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;


public class DateOperation {

    public static int getAge(String birthDate) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        LocalDate newDate = LocalDate.parse(birthDate, formater);
        int years = (int) ChronoUnit.YEARS.between(newDate, localDate);
        return years;
    }

    public static String[] sortStringDates(String[] dates) {
        String[] datesCopy = Arrays.copyOf(dates, dates.length);
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        Arrays.sort(datesCopy, (date1, date2) -> {
            LocalDate d1 = LocalDate.parse(date1, formater);
            LocalDate d2 = LocalDate.parse(date2, formater);
            return d1.compareTo(d2);
        });

        return datesCopy;

    }
}


