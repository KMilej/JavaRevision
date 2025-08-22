import java.util.ArrayList;

public class task15 {
    public void task15() {

        ArrayList<String> guests = new ArrayList<>(); // can be list or ArrayList<String>
        guests.add("Kamil");
        guests.add("Michał");
        guests.add("Edyta");

        for (String guest : guests) {
            System.out.println(guest);
        }
        System.out.println();

        System.out.println("wyswietl co jest z indexem 2");
        System.out.println(guests.get(2));
        //guests.clear(); clear all arraylist

        System.out.println("sprawdz czy w arraylist jest kamil i rafal");
        System.out.println(guests.contains("Kamil"));
        System.out.println(guests.contains("Rafał"));

        System.out.println("dodaj druga Edyte");
        guests.add("Edyta");

        for (String guest : guests) {
            System.out.println(guest);
        }
        System.out.println("usun jedna edyte");
        guests.remove("Edyta");

        for (String guest : guests) {
            System.out.println(guest);
        }
        System.out.println("ArrayList size");
        System.out.println(guests.size());


    }
}
