import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int numberOfRounds = 3;
        int score = 0;

        for (int i = 1; i <= numberOfRounds; i++) {
            System.out.println("Round " + i + ":");
            int randomNumber = ran.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("Guess the number between 1 and 100.");

            do {
                guess = sc.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Too high, try again.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low, try again.");
                }
            } while (guess != randomNumber && attempts < 5);

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                score += 100 / attempts;
            } else {
                System.out.println("You didn't guess the number within the allowed attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("Your score for this round is: " + (100 / attempts));
            System.out.println("Your total score is: " + score);
            System.out.println();
        }

        System.out.println("Your total score is: " + score);
        System.out.println("Thanks for playing!");
    }
}