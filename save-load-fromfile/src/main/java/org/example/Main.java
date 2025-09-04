package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/todo.txt");
        List<String> list = Files.readAllLines(path);

        for (String line : list) {
            System.out.println(line);
        }

        Path path1 = Paths.get("/Users/Kamil/Desktop/KamilFiles/todolist.txt");
        List<String> lista  = Files.readAllLines(path1);

        for (String listazdoc : lista) {
            System.out.println(listazdoc);
        }

        List<String> todo = new ArrayList<>();
        todo.add(System.lineSeparator() + "umyc lustro");  // we can use /n but its not operation system independent
        todo.add("ugotowac obiad");;

        Files.write(path, todo, StandardOpenOption.APPEND);

        todo.add("odkurzyc w mieszkaniu");

        Files.write(path, todo, StandardOpenOption.WRITE);  // nadpisuje od poczatku


        Files.write(path, todo, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING); // overwrite whole file from start





    }
}