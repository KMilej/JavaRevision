import java.util.ArrayList;
import java.util.Scanner;

public class Task21 {
    public void task21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many name do you want to write?");
        int addNames = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        int counterMan = 0;
        int counterWoman = 0;

        for (int i=0; i < addNames;i++) {
            String name = scanner.nextLine();
            list.add(name);
        }

        for (String lists : list) {
            if (lists.endsWith("a")) {
                counterWoman++;
            } else {
                counterMan++;
            }
        }

        System.out.println("woman number is: " + counterWoman );
        System.out.println("Man number is: " + counterMan);


        ArrayList<String> listOfNames = new ArrayList<>();
        System.out.println("how many name you want to add to ArrayList");
        int nameCounter = scanner.nextInt();

        for (int i=0; i < nameCounter; i++) {

            String name = scanner.nextLine();
            listOfNames.add(name);
        }

        int counterM = 0;
        int counterW = 0;

        for (String listt : listOfNames) {
            if (listt.endsWith("a")) {
                counterW++;
            } else {
                counterM++;
            }

        }

        System.out.println("mans are " + counterM);
        System.out.println("woman are " + counterW);









    }
}
