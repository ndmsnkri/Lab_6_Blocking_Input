import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int val = generator.nextInt(10 ) + 1;
        int userGuess = 0;
        boolean done;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 10 (inclusive).");

        // user's guess
        do {
            done = true; // Assume valid input
            System.out.print("Guess the number: ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                    done = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number between 1 and 10.");
                in.nextLine(); // Clear the invalid input
                done = false;
            }
        } while (!done);

        // Display random number
        System.out.printf("The random number was: %d%n", val);

        // Check if the user's guess is correct and provide prints
        if (userGuess == val) {
            System.out.println("Congratulations! You guessed the correct number!");
        } else if (userGuess < val) {
            System.out.println("Sorry, your guess is too low.");
        } else {
            System.out.println("Sorry, your guess is too high.");
        }

    }
}
