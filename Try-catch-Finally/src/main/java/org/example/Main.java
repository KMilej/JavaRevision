package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FinnScann finnalyScanner = new FinnScann();
        finnalyScanner.getUserAge();


        Scanner scanner = new Scanner(System.in);

        int a = 2;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("cant devide by 0");
        } finally {
            System.out.println("ale i tak jedziemy dalej ");
        }

        try {
            System.out.println("ile masz lat?");
      //      int age = scanner.nextInt();
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("You have " + age);
            scanner.close();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("wrong value");

        }

    }
}