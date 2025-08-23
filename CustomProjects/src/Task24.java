import java.util.HashMap;
import java.util.Scanner;

//Stwórz HashMapę, która będzie przechowywać państwa oraz ich stolice. Dodaj do niej pięć przykładowych elementów. Pozwól użytkownikowi zapytać o państwo i w odpowiedzi wyświetl stolicę tego państwa. Gdy państwo nie będzie obecne w HashMapie, wyświetl użytkownikowi odpowiedni komunikat.

public class Task24 {
    public void task24() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> countryAndCapital = new HashMap<>();

        countryAndCapital.put("Polska", "Warszawa");
        countryAndCapital.put("Niemcy", "Berlin");
        countryAndCapital.put("Hiszpania", "Barcelona");
        countryAndCapital.put("Franca", "Paryż");
        countryAndCapital.put("Anglia", "londyn");


        System.out.println("what country do you want to visit soon?");
        System.out.println("you can choose from: ");

        for (String cAc : countryAndCapital.keySet()) {
            System.out.println(cAc);
        }

        String country = scanner.nextLine();

        if (countryAndCapital.containsKey(country)) {
            System.out.println("You choose " + country + " Capital of this country is: " + countryAndCapital.get(country));
        } else {
            System.out.println("this Country is not in our offer");
        }


    }
}