import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "kamil";
        String lastName = "Milej";
        int age = 35;
        System.out.println("mam na imie" + name);
        String concat = name.concat(lastName);
        System.out.println(" " + concat);

        String text = "Mam na imię ";
        text = text.concat(name);
        text = text.concat(" mam ");
        text = text.concat(String.valueOf(age));
        text = text.concat(" lat.");

        System.out.println(text);

        List<String> names = new ArrayList<>();
        names.add("kamil");
        names.add("Dominika");
        names.add("Dominik");

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        // String builder is thread safe

        for (String imiona : names) {
            stringBuilder.append(imiona.toUpperCase());
            stringBuilder.append(", ");
        }

        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length()-1);
            System.out.println(stringBuilder);

        String joinedNames = String.join(", ; ", names);
        System.out.println(joinedNames);

        StringJoiner stringJoiner = new StringJoiner("-");
        stringJoiner.add("Kamil");
        stringJoiner.add("Marius");
        stringJoiner.add("GRAZYNA");
        System.out.println(stringJoiner);

        String splitNames = "Kamil;Rafal;Marius;DOminik";
        splitNames.split(";");

        String[] namesArray = splitNames.split(";");

        List<String> namesList = new ArrayList<>();
        for (String nameSplit : namesArray) {
            System.out.println(nameSplit);
            namesList.add(nameSplit);
        }
        System.out.println("LISTA");
        for (String listname : namesList) {
            System.out.println(listname);
        }
        // change ; for -
        String splitNamesvol2 = "Kamil;Rafal;Marius;DOminik";
        String replace = splitNamesvol2.replace(";", "-");
        System.out.println(replace);


    }
}