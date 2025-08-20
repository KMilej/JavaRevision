import java.util.Scanner;

public class Task5 {
    public void task5() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type any String here");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println(length);
        
        String text = "Jak nauczyć się programowania";
        text = text.replace(" ", "-");
        System.out.println(text);

    }
}
