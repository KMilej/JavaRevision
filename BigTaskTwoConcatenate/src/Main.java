//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringConcatenator stringConcatenator = new StringConcatenator();
        System.out.println(stringConcatenator.concatenate("siema", "Kamil"));
        System.out.println(stringConcatenator.concatenate("siema", "Kamil", "co tam"));
        System.out.println(stringConcatenator.concatenate("This ", "can ", "take ", "many ", "strings ", "together!"));

    }
}