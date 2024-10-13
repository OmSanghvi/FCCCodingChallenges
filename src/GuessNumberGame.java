import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game! Guess a number between 1 and 100.");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }
        in.close();
    }
}
