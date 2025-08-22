import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class task16 {
    public void task16() {

        HashSet<String> guests = new HashSet<>();

        guests.add("Kamil");
        guests.add("Michał");
        guests.add("Natalia");
        guests.add("Edyta");

        for (String guest : guests) {
            System.out.println(guest);
        }

        HashMap<String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Belin");
        countriesAndCapitals.put("Francja", "Paryz");
        countriesAndCapitals.put("Polska", "Kraków"); // update value and warszawa is not anymore capital

//        for (String countries : countriesAndCapitals) {
//            System.out.println(countries);
//        }

        System.out.println(countriesAndCapitals.get("Polska"));
        System.out.println(countriesAndCapitals.get("Czechy"));

        countriesAndCapitals.remove("Polska");

        countriesAndCapitals.put("Polska", "Warszawa");
        System.out.println(countriesAndCapitals.containsValue("Berlin"));
        System.out.println(countriesAndCapitals.containsKey("Niemcy"));


        System.out.println("check all HashMap ");
        Set<String> keys = countriesAndCapitals.keySet();

        for ( String key : keys) {
            System.out.println(countriesAndCapitals.get(key));
            System.out.println(key);
        }

    }
}
