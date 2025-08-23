import java.util.Scanner;

public class Task19 {
    public void task19() {
        double a = 2.5;
        short b = (short) a;
        System.out.println(b);


        System.out.println(" cena na promocji");
        Scanner scanner = new Scanner(System.in);

        System.out.println("wartosc artykułu: ");
        int wartość = scanner.nextInt();

        System.out.println("wartość promocji");
        double promo = scanner.nextDouble();
        promo = 100 - promo;
        promo = promo / 100;

        int suma = (int) Math.round(wartość * promo);


        System.out.println(suma);
    }
}
