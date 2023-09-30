import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        boolean done;

        // Input for the number of gallons of gas in the tank
        do {
            done = true; // Assume valid input
            System.out.print("Enter the number of gallons of gas in the tank: ");

            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                if (gallonsInTank <= 0) {
                    System.out.println("The number of gallons must be greater than zero. Please enter a valid value.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input for gallons in the tank. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Input for the fuel efficiency in miles per gallon
        do {
            done = true; // Assume valid input
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                if (fuelEfficiency <= 0) {
                    System.out.println("Fuel efficiency must be greater than zero. Please enter a valid value.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input for fuel efficiency. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Input for the price of gas per gallon
        do {
            done = true; // Assume valid input
            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                if (pricePerGallon <= 0) {
                    System.out.println("The price per gallon must be greater than zero. Please enter a valid value.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input for price per gallon. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Calculate and display the total cost of the trip
        double totalCost = (gallonsInTank / fuelEfficiency) * pricePerGallon;
        System.out.printf("The total cost of the trip is: $%.2f%n", totalCost);

        // Calculate and display the cost per 100 miles
        double costPer100Miles = (pricePerGallon / fuelEfficiency) * 100;
        System.out.printf("The cost per 100 miles is: $%.2f%n", costPer100Miles);

        // Calculate and display the distance the car can go with the gas in the tank
        double distance = gallonsInTank * fuelEfficiency;
        System.out.printf("The car can go %.2f miles with the gas in the tank.%n", distance);

        in.close();
    }
}
