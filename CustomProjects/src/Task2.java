import java.util.Scanner;

public class Task2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose 1st number");
        int numberOne = scanner.nextInt();
        System.out.println("choose 2nd number");
        int numberTwo = scanner.nextInt();

        int addition = numberTwo + numberOne;
        int subtraction = numberOne - numberTwo;
        int multiplication = numberOne * numberTwo;
        int division = numberOne / numberTwo;



        System.out.println("addition:" + addition + " subtraction: " + subtraction + " multiplication: " + multiplication + " division: " + division);
    }
}
