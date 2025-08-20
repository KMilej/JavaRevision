import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello in Basic Program with small tasks for revision.");
        System.out.println("choose task");
        System.out.println("1) nameSurname, 2) Calculator");


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
