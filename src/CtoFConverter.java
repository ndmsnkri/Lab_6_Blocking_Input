import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        boolean done = false;
        do {
            System.out.print("Enter a temperature in Celsius: ");

            // Check if the input is a valid double
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " C" + " in Fahrenheit is : " + fahrenheit + " F");
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a valid temperature in Celsius.");
                in.nextLine(); // Clear the invalid input
            }
        } while (!done);

    }
}
