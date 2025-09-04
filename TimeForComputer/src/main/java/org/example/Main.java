package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Instant now = Instant.now();

        System.out.println(now); // time UTC

        LocalDateTime warsaw = LocalDateTime.ofInstant(now, ZoneId.of("Europe/Warsaw"));
        LocalDateTime newYork = LocalDateTime.ofInstant(now, ZoneId.of("America/New_York"));
        LocalDateTime edinburgh = LocalDateTime.ofInstant(now, ZoneId.of("Europe/London"));

        System.out.println(warsaw);
        System.out.println(newYork);
        System.out.println(edinburgh);
        System.out.println();

        System.out.println(now.getEpochSecond()); // how many secound gone since epoch time

        Instant instant = Instant.ofEpochSecond(1756987598);  // Time UTC
        System.out.println(instant);
    }
}