import java.util.Random;
import java.util.Scanner;

public class program101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High! Try Again.");
            } else if (guess < number) {
                System.out.println("Too Low! Try Again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != number);

        sc.close();
    }
}