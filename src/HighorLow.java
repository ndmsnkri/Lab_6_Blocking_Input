import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int userGuess = 0;
        boolean validInput;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 10 (inclusive).");

        // Input for the user's guess
        do {
            validInput = true; // Assume valid input
            System.out.print("Guess the number: ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                if (userGuess < min || userGuess > max) {
                    System.out.println("Please enter a number between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number between 1 and 10.");
                in.nextLine(); // Clear the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Display the random number
        System.out.printf("The random number was: %d%n", randomNumber);

        // Check if the user's guess is correct and provide feedback
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number!");
        } else if (userGuess < randomNumber) {
            System.out.println("Sorry, your guess is too low.");
        } else {
            System.out.println("Sorry, your guess is too high.");
        }

        in.close();
    }
}
