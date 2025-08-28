import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Money money = new Money(20, "PLN");
        Money money1 = new Money(20, "PLN");
        System.out.println(money.equals(money1));

//        Money money3 = money;
//
//        System.out.println(money3.equals(money));

        User user = new User("Kamil", "Milej", 35);
        User user1 = new User("Kamil", "Milej", 35);
        User user2 = new User("Mariusz", "Walaszek", 35);

        Map<User, String> map = new HashMap<>();
        map.put(user, "pierwszy");
        map.put(user1, "drugi");
        map.put(user2, "trzeci");

        System.out.println(map.get(user2));
    }
}