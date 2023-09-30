import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        boolean done;

        // Input for the measurement in meters
        do {
            done = true; // Assume valid input
            System.out.print("Enter a measurement in meters: ");

            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                if (meters < 0) {
                    System.out.println("Measurement must be non-negative. Please enter a valid value.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input for meters. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Conversion factors
        double metersToMiles = 0.000621371;
        double metersToFeet = 3.28084;
        double metersToInches = 39.3701;

        // Convert meters to miles, feet, and inches
        double miles = meters * metersToMiles;
        double feet = meters * metersToFeet;
        double inches = meters * metersToInches;

        // Display the converted measurements
        System.out.printf("%.2f meters is equal to %.2f miles%n", meters, miles);
        System.out.printf("%.2f meters is equal to %.2f feet%n", meters, feet);
        System.out.printf("%.2f meters is equal to %.2f inches%n", meters, inches);
        
    }
}
