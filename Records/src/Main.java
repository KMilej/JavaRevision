//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Money money1 = new Money(20, "PLN");
        Money money = new Money(20, "PLN");

        System.out.println(money.equals(money1));
        System.out.println(money.currency());
        System.out.println(money.toString());





    }
}