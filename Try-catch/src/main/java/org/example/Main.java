package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int a = 2;
            int b = 4; //0

            System.out.println(a / b);
            List<String> names = new ArrayList<>();

            names.add("Kamil");
            System.out.println(names.get(0)); //1

            String name = null;
            System.out.println(name.toLowerCase());
        } catch (ArithmeticException | IndexOutOfBoundsException e ) {
            System.out.println("error");
        } catch (NullPointerException e) {
            System.out.println("you have null somewhere");
        }

        // we can use RuntimeExeption

    }
}