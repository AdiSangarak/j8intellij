package in.adi.j8intellij;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimePractise {
    public static void main(String args[])
    {
        DateTimePractise dtp = new DateTimePractise();
        dtp.checkLocalDateTime();
    }

    public void checkLocalDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(8).withYear(2019);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2020, Month.NOVEMBER, 15);
        System.out.println("date3: " + date3);

        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("18:16:22");
        System.out.println("date5: " + date5);
    }
}
