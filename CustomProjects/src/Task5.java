import java.util.Scanner;

public class Task5 {
    public void task5() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type any String here");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println(length);
        
        String text = "Jak nauczyć się programowania";
        text = text.replace(" ", "-");   // change nothing (space) for any symbol
        System.out.println(text);

        String text1 = "  Jak nauczyć się programowania   ";
        text1 = text1.strip(); // delete space from start and end
        System.out.println(text1);

        boolean isItTrue = name.startsWith("K");  // do string start from " " in this case K
        System.out.println(isItTrue);
        boolean endsWith = name.endsWith("l");
        System.out.println(endsWith);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        String taskOnString = "     Jak Nauczyc Sie Programowania    ";
        String substring = taskOnString.strip().toUpperCase().substring(4); // substring means from which index it will show
        System.out.println(substring);

    }
}
