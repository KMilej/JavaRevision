package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get("src/main/resources/quiz.txt");

        List<String> lines = Files.readAllLines(path);
        int points = 0;

        for (String line : lines) {
            String[] questionAndAnswers = line.split(";");
            //  System.out.println(lines);
            System.out.println(questionAndAnswers[0]);
            System.out.println("1. " + questionAndAnswers[1]);
            System.out.println("2. " + questionAndAnswers[2]);
            System.out.println("3. " + questionAndAnswers[3]);
            System.out.println("4. " + questionAndAnswers[4]);
            System.out.println();
            System.out.println("which answer do you choose?");
            System.out.println();
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer == Integer.parseInt(questionAndAnswers[5])) {
                System.out.println("this is good answer, well done");
                points++;
            } else {
                System.out.println("this is wrong answer");
                int correctAnswer = Integer.parseInt(questionAndAnswers[5]);
                System.out.println("the correct answer is " + questionAndAnswers[correctAnswer]);
                        
            }
        }
        System.out.println("you make correct answer " + points);
    }
}