package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime pastDateTime = LocalDateTime.of(2025, 9, 4, 12, 00);

        Duration between = Duration.between(pastDateTime, now);
        System.out.println(between.getSeconds());



        // THIS NOt Working because we can use Duration Class only when we use LocalDateTime not LocalDate
        LocalDate nowDate = LocalDate.now();
        LocalDate pastDate = LocalDate.of(2025, 9, 3);
//        Duration duration = Duration.between(pastDate, nowDate);
//        System.out.println(duration.getSeconds());

        // we need use Period

        Period period = Period.between(pastDate, nowDate);
        System.out.println(period.getDays());

        // example with Duration for amount of time

        System.out.println(now);
        Duration durationOfTenMinutes = Duration.ofMinutes(10);

        LocalDateTime newDateTime = now.plus(durationOfTenMinutes);
        System.out.println(newDateTime);

        // now lets try to do with period

        Period periodOfOneDay = Period.ofDays(1);
        LocalDateTime newDateTiemTwo = now.plus(periodOfOneDay);
        System.out.println(newDateTiemTwo);

        // another option to add or -

        System.out.println("added 3 days");

        LocalDateTime newtime = now.plusDays(3);
        System.out.println(newtime);


    }
}