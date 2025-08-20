import java.util.Scanner;

public class Task10 {
    public void task10() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("write 1st number");
        int num = scanner.nextInt();
        System.out.println("write 2 number");
        int num1 = scanner.nextInt();
        System.out.println("write 3 number");
        int num2 = scanner.nextInt();

        if (num > num1 && num > num2) {
            System.out.println(num + "is the biggest");
        } else if (num1 > num && num1 > num2) {
            System.out.println(num1 + " is the biggest number");
        } else if (num2 > num1 && num2 > num) {
            System.out.println(num2 + "is the biggest number");
        }
    }
}
