package NumberGame;

import java.util.Scanner;
public class NumberGame {
	// Function that implements the
	// number guessing game
	public static void
	guessingNumberGame()
	{
	    boolean playAgain = true;
        while (playAgain) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int)(100* Math.random());

		// Given K maxattempts
		int K = 10;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println(
				"Enter your guess: ");
			

			// Take User input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number in "+i+" Attempts");
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted"
				+ " K trials.");

			System.out.println(
				"The number was " + number);
		}
		System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }
	}

	// Driver Code
	public static void
	main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}
