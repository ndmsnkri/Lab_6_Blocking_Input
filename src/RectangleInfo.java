import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        boolean done;

        // Input for the width of the rectangle
        do {
            done = true; // Assume valid input
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width <= 0) {
                    System.out.println("Width must be greater than zero. Please enter a valid width.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input for width. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Input for the height of the rectangle
        do {
            done = true; // Assume valid input
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be greater than zero. Please enter a valid height.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input for height. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Calculate and display the area of the rectangle
        double area = width * height;
        System.out.println("The area of the rectangle is: " + area);

        // Calculate and display the perimeter of the rectangle
        double perimeter = 2 * (width + height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Calculate and display the length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(width * width + height * height);
        System.out.println("The length of the diagonal is: " + diagonal);

        in.close();
    }
}
