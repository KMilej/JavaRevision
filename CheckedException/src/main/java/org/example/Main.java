package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NamesReader namesReader = new NamesReader("src/main/resources/names.txt");
        try {
            namesReader.printallNames();
        } catch (IOException e) {
            System.out.println("Plik was not found");
        }


    }
}