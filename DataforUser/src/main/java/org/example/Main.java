package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2025, 9, 4);

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(12, 23);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2025, 9, 5, 12, 00);
        System.out.println(localDateTime);

        System.out.println();

        // time in your local striefie czasowej
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime now1 = LocalDateTime.now();

        System.out.println(now1);

        // show time in diffrent strefie czasowej

        LocalDateTime newYork = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYork);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        for (String zoneid : availableZoneIds) {
            System.out.println(zoneid);
        }


    }
}