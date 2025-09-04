package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your birth date YYYY-MM-DD");
        String dateString = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dateString);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(dateOfBirth);

        Period period = Period.between(dateOfBirth, now);
        System.out.println("masz " + period.getYears() + " years.");
        System.out.println("you have " + period.getMonths() + " Months");
        System.out.println("you have " + period.getDays() + " days");




    }
}