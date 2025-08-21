import java.util.Scanner;

public class Task11 {
    public void task11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose 1st whole number");
        int numberOne = Integer.parseInt(scanner.nextLine());

        System.out.println("Choose 2nd whole number");
        int numberTwo = Integer.parseInt(scanner.nextLine());

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Choose operation: addition, subtraction, multiplication, division (or type exit)");
            String choose = scanner.nextLine().trim().toLowerCase();

            switch (choose) {
                case "addition" -> System.out.println(numberOne + numberTwo);
                case "subtraction" -> System.out.println(numberOne - numberTwo);
                case "multiplication" -> System.out.println(numberOne * numberTwo);
                case "division" -> {
                    if (numberTwo == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println(numberOne / (double) numberTwo);
                    }
                }
                case "exit" -> isRunning = false;
                default ->
                        System.out.println("Unknown operation. Try: addition, subtraction, multiplication, division, exit.");
            }
        }

        scanner.close();
    }
}
