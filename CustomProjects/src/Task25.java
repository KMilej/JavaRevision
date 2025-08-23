import java.util.ArrayList;
import java.util.Scanner;

public class Task25 {
    public void task25() {
        ArrayList<String> nameOfPeople = new ArrayList<>();
        nameOfPeople.add("Kamil");
        nameOfPeople.add("Iza");
        nameOfPeople.add("Piotr");
        nameOfPeople.add("Michał");
        nameOfPeople.add("krzyś");
        nameOfPeople.add("Ivona");
        nameOfPeople.add("Edyta");
        nameOfPeople.add("Marcin");
        nameOfPeople.add("Kevin");
        nameOfPeople.add("Gabrysia");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose name from the list: ");

        for (String names : nameOfPeople) {
            System.out.print(names + " ");
        }
        System.out.println();
        String name = scanner.nextLine();

        if (nameOfPeople.contains(name)) {
            System.out.println("Name you Choose has index: " + nameOfPeople.indexOf(name));
        } else {
            System.out.println("Wrong name");
        }

    }
}
