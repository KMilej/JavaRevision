import java.util.Scanner;

public class Task13 {
    public void task13() {
        boolean shouldcontinue = true;
        Scanner scanner = new Scanner(System.in);

        while (shouldcontinue) {
            System.out.println("do you want to continue?");
            String answer = scanner.nextLine();
            scanner.nextLine();

            if (answer.equals("no")) {
                shouldcontinue = false;
            }
        }

        /*Break*/

        //task1
        for (int a = 0; a < 11; a++) {
            System.out.println(a);
        }
        //task2
        System.out.println("type Natural Number");
        int N = scanner.nextInt();
        int sum = 0;

        for (int n = N; n > 0; n--) {
            sum += n;
            System.out.println("sum so far is: " + sum);
        }

        //task3
        int factorial = 1;

        while (N >= 2) {
            factorial *= N;
            N--;
            System.out.println(factorial);
        }
        //task 4
        System.out.println("how many fibo number do you want to see?");
        int fib = scanner.nextInt();
        int first = 0, second = 1;

        for (int c = 0; c < fib; c++) {

            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        //task 5

        System.out.println("from: ");
        int from = scanner.nextInt();

        System.out.println("to: ");
        int to = scanner.nextInt();

        int even = 0;
        int odd = 0;

        for (int f = from; f <= to; f++) {
            System.out.println("Number: " + f);

            if (f % 2 == 0) {
                even += f;
            } else {
                odd += f;
            }
        }

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);


    }
}
