import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task27 {
    public void task27() {

        int MAX_RENTALS = 3;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> carRentalDB = new HashMap<>();
        ArrayList<String> myRented = new ArrayList<>();

        carRentalDB.put("Mercedes", "available"); //unavailable
        carRentalDB.put("BMW", "available");
        carRentalDB.put("Audi", "available");
        carRentalDB.put("Volkswagen", "available");
        carRentalDB.put("Toyota", "available");
        carRentalDB.put("Honda", "available");
        carRentalDB.put("Ford", "available");
        carRentalDB.put("Opel", "available");
        carRentalDB.put("Kia", "available");
        carRentalDB.put("Hyundai", "available");
        carRentalDB.put("Mazda", "available");
        carRentalDB.put("Nissan", "available");
        carRentalDB.put("Peugeot", "available");
        carRentalDB.put("Renault", "available");
        carRentalDB.put("Skoda", "available");
        carRentalDB.put("Volvo", "available");
        carRentalDB.put("Fiat", "available");
        carRentalDB.put("Chevrolet", "available");
        carRentalDB.put("Tesla", "available");
        carRentalDB.put("Jaguar", "available");

        boolean isRunning = true;


        System.out.println("Welcome in car rental app");
        System.out.println("this is all cars in our offer");
        for (Map.Entry<String, String> list : carRentalDB.entrySet()) {
            System.out.println(list);
        }
        while (isRunning) {
            System.out.println("===Main Menu===");
            System.out.println("1.show all cars with status");
            System.out.println("2.show all cars anly available");
            System.out.println("3.show all rented cars by me");
            System.out.println("4.Rent a car");
            System.out.println("5.Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    for (Map.Entry<String, String> list : carRentalDB.entrySet()) {
                        System.out.println(list);
                        System.out.println(list.getKey() + " : " + list.getValue());
                    }
                }
                case 2 -> {
//                    for (String names : carRentalDB.values()) {
                    for (Map.Entry<String, String> names : carRentalDB.entrySet()) {
                        if ("available".equals(names.getValue())) {
                            System.out.println(names.getKey());
                        } else {
                            System.out.println("car is not available" + names.getKey());
                        }
                    }
                }
                case 3 -> {
                    if (myRented.isEmpty()) {
                        System.out.println("you dont rented any car/s");
                    } else {
                        for (String car : myRented) {
                            System.out.println(car);
                        }
                    }

                }
                case 4 -> {
                    if (myRented.size() >= MAX_RENTALS) {
                        System.out.println("you have reached the limit of " + MAX_RENTALS + " cars");

                    } else {

                        System.out.println("what do you want to borrow?");
                        scanner.nextLine();
                        String name = scanner.nextLine().trim();
                        if (!carRentalDB.containsKey(name)) {
                            System.out.println("No car in database");

                        }
                        String status = carRentalDB.get(name);
                        if (!"available".equals(status)) {
                            System.out.println("this car is already rented.");

                        }
                        carRentalDB.put(name, "rented");
                        myRented.add(name);
                        System.out.println("rented: " + name + " (" + myRented.size() + "/" + MAX_RENTALS + ")");

                    }
                }
                case 5 -> {
                    System.out.println("exit");
                    isRunning = false;
                }
                default -> System.out.println("invalid option choose from 1-5");
            }
        }


    }
}

