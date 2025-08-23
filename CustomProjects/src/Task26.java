import java.util.ArrayList;
import java.util.Scanner;

public class Task26 {
    public void task26() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesDataBase = new ArrayList<>();
        namesDataBase.add("Kamil");
        namesDataBase.add("Edyta");
        namesDataBase.add("Kevin");
        namesDataBase.add("Gabriela");
        namesDataBase.add("Barbara");
        namesDataBase.add("Waldemar");
        namesDataBase.add("Marcin");


        boolean isRunning = true;

        System.out.println("Hello in name Program with few Features");
        System.out.println("in nameDatabase is right now");

        for (String names : namesDataBase) {
            System.out.print(names + " ");
        }
        System.out.println();
        while (isRunning) {
            System.out.println("choose what you want to do, you can: ");
            System.out.println("1 for Add");
            System.out.println("2 for Delete");
            System.out.println("3 for Show currently list");
            int Choice = scanner.nextInt();
            scanner.nextLine();

            switch (Choice) {
                case 1 -> {
                    System.out.println("Add");
                    String name = scanner.nextLine();
                    namesDataBase.add(name);

                }
                case 2 -> {
                    System.out.println("delete");
                    String name = scanner.nextLine();
                    namesDataBase.remove(name);
                }
                case 3 -> {
                    for (String names : namesDataBase) {
                        System.out.println(names);
                    }
                }
                case 10 -> {
                    System.out.println("exit");
                    isRunning = false;
                }

            }
        }
    }
}
