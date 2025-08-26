import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("OOP Programming Menu");
        System.out.println("1). basic User Class, 2).Car app, 3) PasswordValidator, 4) Max Speed, 5) AddFuel, 6) user/mod/admin, 7) ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                User kamil = new User("Kamil", 34, false);
                User Edyta = new User("Kamil", 34, false, "km@gmail.com");
                System.out.println(kamil.getName());
                System.out.println(kamil.getIsActive());
                System.out.println(kamil.getAge());
                kamil.printUserInformation();
                boolean canBuyOrNo = kamil.canBuyProduct();
                System.out.println(canBuyOrNo);
                kamil.setEmail("Kmil@gmailcom");
                kamil.sendEmail("bardzo lubie jesc pizze");
                Edyta.printUserInformation();
                Edyta.setAge(15);
            }
            case 2 -> {
                Car mojCar = new Car("Toyota", "Focus", 2019, "Blue");
                Car nieMojCar = new Car("Toyota", "Puma", "Red");
                System.out.println(mojCar);
                System.out.println(nieMojCar);
            }
            case 3 -> {
                PasswordValidator passwordValidator = new PasswordValidator();
                passwordValidator.validatorPassword("elo!");
            }
            case 4 -> {
                MaxSpeed maxSpeed = new MaxSpeed(0, 60, 450);
                maxSpeed.drive(120, 100);
                System.out.println(maxSpeed);
                maxSpeed.addFuel(100);
                System.out.println(maxSpeed);
                maxSpeed.drive(20, 20);
                System.out.println(maxSpeed);
            }
            case 5 -> {
                System.out.println("make your dream");
                System.out.println("make:");
                scanner.nextLine();
                String make = scanner.nextLine();
                System.out.println("model:");
                String model = scanner.nextLine();
                System.out.println("Production Year");
                int productionYear = Integer.parseInt(scanner.nextLine());
                String color = scanner.nextLine();
                int maxSpeed = Integer.parseInt(scanner.nextLine());
                int range = Integer.parseInt(scanner.nextLine());

                CreateCar BMW = new CreateCar(make, model, productionYear, color, maxSpeed, range);
                System.out.println(BMW);
                System.out.println("this is make and model " + BMW.getMake() + " " + BMW.getModel());

                System.out.println("how many km do you want to drive?");
                int distance = Integer.parseInt(scanner.nextLine());

                BMW.drive(distance);
                System.out.println("left: " + BMW.getRange());
                System.out.println("add fuel: ");
                int addFuel = Integer.parseInt(scanner.nextLine());
                BMW.addFuel(addFuel);
            }
            case 6 -> {
                Użytkownik użytkownik = new Użytkownik();
                użytkownik.addPost("jakis post");
                Admin admin = new Admin();
                admin.addPost("Elo");
                ArrayList<Użytkownik> lista = new ArrayList<>();

                lista.add(admin);
            }
            case 7 -> {
                Człek alladyn = new Człek();

                LenghtPasswordValidator lenghtPasswordValidator = new LenghtPasswordValidator();
                SpecialCharactersPasswordValidator specialCharactersPasswordValidator = new SpecialCharactersPasswordValidator();

                alladyn.setPassword("owoce", lenghtPasswordValidator);
                alladyn.setPassword("owoce", specialCharactersPasswordValidator);
            }

        }

    }
}
