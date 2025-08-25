import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Hello in Basic Program with small tasks for revision.");
            System.out.println("choose task");
            System.out.println("1) nameSurname, 2) Calculator, 3) Math.round, 4) FinanceOperation, 5) String option, 6)BooleanOperation, 7), Operators, 8) && and ||, 9) conditional instructions, 10), 11)choose operation, 12) for loop, 13) while loop, 14) for loop, 15) ArrayList, 50) Exit program");
            System.out.println("16)HashSet, 17) ArrayList ,18) palindrom , 19) Casting prymitiveTypes, 20) Text Block, 21) name to Array, 22) Hashmap count, 23) 2Arraylist with names, 27) Borrow car, 28) RandomKolejnosc ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    new Task1();
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    task2.run();
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    task3.task3();
                    break;
                case 4 :
                    Task4 task4 = new Task4();
                    task4.task4();
                case 5 :
                    Task5 task5 = new Task5();
                    task5.task5();
                case 6:
                    Task6 task6 = new Task6();
                    task6.task6();
                case 7 :
                    Task7 task7 = new Task7();
                    task7.task7();
                case 8 :
                    Task8 task8 = new Task8();
                    task8.task8();
                case 9:
                    Task9 task9 = new Task9();
                    task9.task9();
                case 10:
                    Task10 task10 = new Task10();
                    task10.task10();
                case 11:
                    Task11 task11 = new Task11();
                    task11.task11();
                case 12:
                    Task12 task12 = new Task12();
                    task12.task12();
                case 13:
                    Task13 task13 = new Task13();
                    task13.task13();
                case 14:
                    Task14 task14 = new Task14();
                    task14.task14();
                case 15:
                    task15 task15 = new task15();
                    task15.task15();
                case 16:
                    task16 task16 = new task16();
                    task16.task16();
                case 17:
                    Task17 task17 = new Task17();
                    task17.task17();
                case 18:
                    Task18 task18 = new Task18();
                    task18.task18();
                case 19:
                    Task19 task19 = new Task19();
                    task19.task19();
                case 20:
                    Task20 task20 = new Task20();
                    task20.task20();
                case 21:
                    Task21 task21 = new Task21();
                    task21.task21();
                case 22:
                    Task22 task22 = new Task22();
                    task22.task22();
                case 23:
                    Task23 task23 = new Task23();
                    task23.task23();
                case 24:
                    Task24 task24 = new Task24();
                    task24.task24();
                case 25:
                    Task25 task25 = new Task25();
                    task25.task25();
                case 26:
                    Task26 task26 = new Task26();
                    task26.task26();
                case 27:
                    Task27 task27 = new Task27();
                    task27.task27();
                case 28:
                    Task28 task28 = new Task28();
                    task28.task28();
                case 50:
                    System.out.println("Exiting program");
                    running = false;
                    break;
                default:
                    System.out.println("unknown option");
                    break;
            }
        }
        scanner.close();
    }
}
