import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("OOP Programming Menu");
        System.out.println("1). basic User Class, 2). ");
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
        }

    }
}
