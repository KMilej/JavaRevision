package org.example;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        Instant before = Instant.now();

        for (int i =0; i < 100_000_000; i++) {
            int randomNumber = random.nextInt(100_000_00) + 1;
            numbers.add(randomNumber);

        }

        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);

        System.out.println(duration.toMillis());

        // task 2  Local Date Adjusters

        LocalDate teraz = LocalDate.now();
        System.out.println(teraz);
//        LocalDate teraz2 = teraz.withYear(2022);
//        System.out.println(teraz2);
        LocalDate nextOrSameTuesday = teraz.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        LocalDate nextOrSameTuesdayPrevious = teraz.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(nextOrSameTuesdayPrevious);
        System.out.println(nextOrSameTuesday);

    }
}