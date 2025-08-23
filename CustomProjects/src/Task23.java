import java.util.ArrayList;

public class Task23 {
    public void task23() {

        ArrayList<String> arrayListOne = new ArrayList<>();
        ArrayList<String> arrayListTwo = new ArrayList<>();
        arrayListOne.add("Kamil");
        arrayListOne.add("Edyta");
        arrayListOne.add("Gabrysia");
        arrayListOne.add("Kevinek");
        arrayListOne.add("Anna");
        arrayListOne.add("Marek");
        arrayListOne.add("Ola");
        arrayListOne.add("Piotr");
        arrayListOne.add("Kasia");
        arrayListOne.add("Tomek");

        // Dodajemy imiona do drugiej listy (część się powtarza)
        arrayListTwo.add("Gabrysia");  // powtarza się
        arrayListTwo.add("Kevinek");   // powtarza się
        arrayListTwo.add("Anna");      // powtarza się
        arrayListTwo.add("Marek");     // powtarza się
        arrayListTwo.add("Zosia");
        arrayListTwo.add("Bartek");
        arrayListTwo.add("Magda");
        arrayListTwo.add("Jan");
        arrayListTwo.add("Karol");
        arrayListTwo.add("Natalia");


        ArrayList<String> listOfSameName = new ArrayList<>();

        for (int i=0; i < arrayListOne.size();i++) {
            String name = arrayListOne.get(i);
            for (int j=0; j < arrayListTwo.size();j++) {
                String name1 = arrayListTwo.get(j);
                if (name == name1) {
                    listOfSameName.add(name);
                } else {
                    System.out.println(name + " is not same as " + name1);
                }
            }

        }

        for (String list: listOfSameName) {
            System.out.println(list);
        }
//
//        for ( String one : arrayListOne) {
//            if (arrayListTwo.contains(one)) {
//                System.out.println(one);
//            } else {
//                System.out.println("array not cortain " + one);
//            }
//        }



    }
}
