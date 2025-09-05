package org.example;

import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WordProcessor wordProcessor = new WordProcessor("  turnon   ");
        System.out.println(wordProcessor.stripandCapitalize());


        // doesnt work like that
//        WordProcessor wordProcessorNull = new WordProcessor(null);
//        String nuil = wordProcessorNull.stripandCapitalize();
//        System.out.println(nuil);

        String[] names = new String[3];
        names[0] = "Kamil";
        names[1] = "Michal";
        names[2] = "Edyta";

        for (int i=0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 1st number");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Give me a 2nd number");
        int b = Integer.parseInt(scanner.nextLine());

        try {
            System.out.println("result of a/b " + (a / b ));
        } catch (ArithmeticException e) {
            System.out.println("you can devide by 0 ");
        }

        System.out.println("thanks for using this program");



    }
}