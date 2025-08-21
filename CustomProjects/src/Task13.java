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

        // task6 – liczby pierwsze w przedziale
        System.out.println("\n--- Task 6 ---");
        System.out.println("Enter start of range:");
        int start = scanner.nextInt();
        System.out.println("Enter end of range:");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // task7 – potęgowanie bez Math.pow()
        System.out.println("\n--- Task 7 ---");
        System.out.println("Enter base A:");
        int A = scanner.nextInt();
        System.out.println("Enter exponent B:");
        int B = scanner.nextInt();

        long result = 1;
        for (int i = 0; i < B; i++) {
            result *= A;
        }
        System.out.println(A + "^" + B + " = " + result);

        // task8 – piramida
        System.out.println("\n--- Task 8 ---");
        System.out.println("Enter number of rows for pyramid:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }

    // pomocnicza metoda do sprawdzania liczb pierwszych
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;

    }
}
