package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
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
    }
}