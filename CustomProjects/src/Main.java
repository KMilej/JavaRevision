import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Hello in Basic Program with small tasks for revision.");
            System.out.println("choose task");
            System.out.println("1) nameSurname, 2) Calculator, 3) Math.round, 4) FinanceOperation, 5) String option 50) Exit program");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    new Task1();
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    task2.run();
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    task3.task3();
                    break;
                case 4 :
                    Task4 task4 = new Task4();
                    task4.task4();
                case 5 :
                    Task5 task5 = new Task5();
                    task5.task5();
                case 50:
                    System.out.println("Exiting program");
                    running = false;
                    break;
                default:
                    System.out.println("unknown option");
                    break;
            }
        }
        scanner.close();
    }
}
