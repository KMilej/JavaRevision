import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = null;
        String name1 = "kamil";
        String name3 = new String("kamil");
        String name4 = name3.intern();



        System.out.println(name == name1);
        System.out.println(name == name3);
        System.out.println(name == name4);

        System.out.println("comparing Strings");

        if (name != null && name.equals("kamil")){
            System.out.println("Yes this is kamil");
        }

        if ("kamil".equals(name)) {
            System.out.println("yes this is kamil");
        }

        if (Objects.equals(name, "kamil")) {
            System.out.println("yes this is kamil");
        }

        String nameIgnoreCase = "KAMIL";

        if (nameIgnoreCase != null && nameIgnoreCase.equalsIgnoreCase("kamil")){
            System.out.println("Yes this is kamil");
        }

        if ("kamil".equalsIgnoreCase(nameIgnoreCase)) {
            System.out.println("yes this is kamil");
        }

        if (Objects.equals(nameIgnoreCase, "kamil")) {
            System.out.println("yes this is kamil");
        }


    }
}