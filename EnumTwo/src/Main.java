import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("choose a month");
        Scanner scanner = new Scanner(System.in);
        String monthChoosen = scanner.nextLine().toUpperCase();

        try {
            Months months = Months.valueOf(monthChoosen.toUpperCase());
            int days = months.getDays();
            System.out.println("the month: " + months + " has " + days + " days.");
        } catch (IllegalArgumentException e) {
            System.out.println("invalid month entered!");
        }


    }
}