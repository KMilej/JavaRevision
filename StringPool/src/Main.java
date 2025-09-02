//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "kamil";
        String name1 = "kamil";
        String name3 = new String("kamil");
        String name4 = name3.intern();



        System.out.println(name == name1);
        System.out.println(name == name3);
        System.out.println(name == name4);
    }
}