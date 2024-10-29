import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle car1 = new Car("Seat", "Ibiza", 2020, 4);
        Vehicle car2 = new Car("Opel", "Insignia", 2015, 5);
        Vehicle motorcycle1 = new MotorCycle("MotoBrand1", "MotoModel1", 2022, 100);
        Vehicle motorcycle2 = new MotorCycle("MotoBrand2", "MotoModel2", 2010, 80);

        garage.addVehicle(car1);
        garage.addVehicle(car2);
        garage.addVehicle(motorcycle1);
        garage.addVehicle(motorcycle2);

        garage.showVehicles();
        garage.moveAll();

        menu(garage);

    }

    private static void menu (Garage garage){
        int option;
        do {
            System.out.println(" --- Vehicle Management System ---\n" +
                    "  1. Add a Car\n" +
                    "  2. Add a Motorcycle1\n" +
                    "  3. Show all vehicles in the garage.\n" +
                    "  4. Move all vehicles.\n" +
                    "  5. Exit.");

            Scanner sc = new Scanner(System.in);
            String brand;
            String model;
            int year;
            int doors;
            int capacity;

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the car details:");
                    System.out.println("Brand: ");
                    brand = sc.nextLine();
                    System.out.println("Model: ");
                    model = sc.nextLine();
                    System.out.println("Year: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Number of doors: ");
                    doors = sc.nextInt();
                    garage.addVehicle(new Car(brand, model, year, doors));
                    break;

                case 2:
                    System.out.println("Enter the motorcycle details:");
                    System.out.println("Brand: ");
                    brand = sc.nextLine();
                    System.out.println("Model: ");
                    model = sc.nextLine();
                    System.out.println("Year: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Engine capacity: ");
                    capacity = sc.nextInt();
                    sc.nextLine();
                    garage.addVehicle(new MotorCycle(brand, model, year, capacity));
                    break;

                case 3:
                    System.out.println("Showing all vehicles in the garage:");
                    if(garage.getVehicles().isEmpty()){
                        System.out.println("The garage is empty!");
                    }
                    else{
                        garage.showVehicles();
                    }
                    System.out.println("----------");
                    break;

                case 4:
                    System.out.println("Moving all vehicles...");
                    if(garage.getVehicles().isEmpty()){
                        System.out.println("The garage is empty!");
                    }
                    else {
                        garage.moveAll();
                    }
                    System.out.println("----------");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Error! Enter valid option [1 - 5]: ");
            }
        } while (option != 5);

    }

}