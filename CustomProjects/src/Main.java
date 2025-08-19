import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello in Basic Program with all small task to make code revision what task do you want to see?");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                new Task1();
                break;

            case 2:
                System.out.println("elo");
                break;
        }






        }
    }
