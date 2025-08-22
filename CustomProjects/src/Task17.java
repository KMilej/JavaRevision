import java.util.ArrayList;

public class Task17 {
    public void task17() {

        for (int i = 0; i < 10; i++) {

            if (i == 4) continue;

            if (i == 8) break;
            System.out.println(i);

            ArrayList<String> names = new ArrayList<>();

            names.add("Kamil");
            names.add("mateusz");
            names.add("Edyta");

            for (String name : names) {

         //       if (name == "mateusz") continue;
                if (name.startsWith("m")) continue;
                System.out.println(name);


            }


        }
    }
}
