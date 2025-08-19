import java.util.Scanner;

public class Task1 {
    public Task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Name %s age %d%n", name, age);

        System.out.println("What is your name?");
        String name1 = scanner.nextLine();

        System.out.println("What is your age?");
        int age1 = scanner.nextInt();

        System.out.println(name1 + " " + age1);
        scanner.close();
    }
}
