import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("how old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Name " + name + " age " + age);

        System.out.println("what is your name?");
        String Name1 = scanner.nextLine();

        System.out.println("what is your age?");
        int age1 = scanner.nextInt();

        System.out.println(Name1 + " " + age1);





        }
    }
