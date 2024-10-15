import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class CountDate {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar startDate=Calendar.getInstance();
        startDate.set(2022,Calendar.JANUARY,12);
       Long countDate= ChronoUnit.DAYS.between(
                LocalDateTime.ofInstant(startDate.toInstant(),startDate.getTimeZone().toZoneId()),
                LocalDateTime.ofInstant(calendar.toInstant(),calendar.getTimeZone().toZoneId()));
        System.out.println(calendar.getTime());
        System.out.println(startDate.getTime());
        System.out.println(countDate);
    }
}
