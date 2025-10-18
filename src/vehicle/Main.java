package vehicle;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalSystem system = new RentalSystem();

        // Add sample cars
        system.addcar(new Car("C101", "Toyota", "Innova", 2500));
        system.addcar(new Car("C102", "Hyundai", "i20", 1800));
        system.addcar(new Car("C103", "Tata", "Nexon", 2200));

        while (true) {
            System.out.println("\n=== CAR RENTAL SYSTEM ===");
            System.out.println("1. View Cars");
            System.out.println("2. Rent Car");
            System.out.println("3. Return Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.showAvailableCars();
                    break;

                case 2:
                    System.out.print("Enter Car ID: ");
                    String carId = sc.next();
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    system.rentCar(carId, days);
                    break;

                case 3:
                    System.out.print("Enter Car ID to return: ");
                    String returnId = sc.next();
                    system.returnCar(returnId);
                    break;

                case 4:
                    System.out.println("Thank you for using the Car Rental System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
