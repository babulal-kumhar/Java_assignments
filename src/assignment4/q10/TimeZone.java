package assignment4.q10;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZone{
    public static void main(String[] args) {

        System.out.println("India: " +ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println("USA (New York): " +ZonedDateTime.now(ZoneId.of("America/New_York")));

        System.out.println("London: " +ZonedDateTime.now(ZoneId.of("Europe/London")));
    }
}
