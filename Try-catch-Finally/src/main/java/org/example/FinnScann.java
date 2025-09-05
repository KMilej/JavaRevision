package org.example;

import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinnScann {



    public int getUserAge() {
        Scanner scanner = new Scanner(System.in);
        try {                 // Scanner scanner = new Scanner(System.in))
            System.out.println("how old are you?");
            int age = scanner.nextInt();
            return age;
        } catch (InputMismatchException e) {
            System.out.println("bledny format");
        } finally {
            System.out.println("zamykamy scanner");
            scanner.close();
        }

        // we use scanner.close in finally inside method because we skip it we use on correct data

        // only System.exit finish finally

        return -1;

    }
}
