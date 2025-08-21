public class Task14 {
    public void task14() {
        String[] quests = new String[3];
        quests[0] = "Kamil";
        quests[1] = "Michal";
        quests[2] = "Edyta";

        for (int i=0; i<3; i++) {
            System.out.println(quests[i]);
        }

        String[] goscie = new String[] {"Kamila", "Michał", "Ola"};

        for (int o=0; o < goscie.length; o++ ) {
            System.out.println(goscie[o]);
        }

        goscie[0] = "Kamil"; // change in index 0 value

        String[] party = new String[] {"fruit", "vegetable", "seafood"};
        for (String party1 : party ) {
            System.out.println(party1);
        }
    }
}
