import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user = new User();
        Moderator moderator = new Moderator();
        Admin admin = new Admin();

        users.add(user);
        users.add(moderator);
        users.add(admin);

        User user1 = users.get(1);
        Moderator user2 = (Moderator) users.get(1);// we can use type casting if it is on inheritance line
        Admin user3 = (Admin) users.get(2); // we cant convert with index 1
        user1.Hello();
        user2.editPost();
        user3.deletePost();

        //up casting to wtedy gdy
//        User example = new Admin();
//        User example2 = new Moderator();
//
//        // Down Casting
//        Moderator user5 = (Moderator) users.get(1);


        //JAVA 13 and below
        for (User userzy : users) {              //kolejnosc ma znaczenie od najnizszego
          //  System.out.println(userzy);
            if (userzy instanceof Admin ) {
                ((Admin) userzy).deletePost();
            } else if (userzy instanceof Moderator) {
                ((Moderator) userzy).editPost();

            } else {
                userzy.Hello();
            }
        }
        // from Java 14
        for (User example2 : users) {
            if (example2 instanceof Admin admin10) {
                admin10.deletePost();
            } else if (example2 instanceof Moderator moderator10) {
                moderator10.editPost();
            } else {
                example2.Hello();
            }

        }


    }
}