import java.util.Scanner;

public class Task9 {
    public void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi what is your Age?");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age < 18) {
            System.out.println("you have less then 18");
        } else if (age < 25) {
            System.out.println("you cant buy alkohol in US");
        } else {
            System.out.println("you can buy alcohol");
        }

        boolean isTure = false;
        while (!isTure) {
            System.out.println("jakie jest swiatlo ? (zielone, zółte, czerwone)");
            String lights = scanner.nextLine();
            if (lights.equals("zielone")) {
                System.out.println("you can drive");
            } else if (lights.equals("zółte")) {
                System.out.println("lets stop");
            } else if (lights.equals("czerwone")) {
                System.out.println("Dont move and stop");
            } else if (lights.equals("exit")) {
                isTure = true;
                break;
            } else {
                System.out.println("you do not choose from zielone, zółte, czerwone");
            }

            System.out.println("Jak masz na imię?");
            String name = scanner.nextLine();

            System.out.println("Ile masz lat?");
            int age10 = scanner.nextInt();

            boolean isFemale = name.endsWith("a");
            boolean isAdult = age10 >= 18;

            if (isAdult && isFemale) {
                System.out.println("Jesteś pełnoletnia");
            } else if (isAdult) {
                System.out.println("Jesteś pełnoletni");
            } else if (isFemale) {
                System.out.println("Jeszcze nie jesteś pełnoletnia");
            } else {
                System.out.println("Jeszcze nie jesteś pełnoletni");
            }

            scanner.close();

        }
    }
}
