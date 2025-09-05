package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String formatted = now.format(DateTimeFormatter.ISO_DATE);
        String formatted1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String formatted2 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(formatted);
        System.out.println(formatted1);
        System.out.println(formatted2);

        DateTimeFormatter myFormater = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter myFormater1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String myFormat = now.format(myFormater);
        System.out.println(myFormat);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d'th' MMMM yyyy");
        String formatted3 = now.format(dateTimeFormatter);
        System.out.println(formatted3);

        String dateString = "10/09/2023 16:00";
        LocalDateTime parsed = LocalDateTime.parse(dateString, myFormater1);
        System.out.println(parsed);

        String dateString2 = "5th September 2023";
        LocalDate parse = LocalDate.parse(dateString2, dateTimeFormatter);
        System.out.println(parse);


    }
}