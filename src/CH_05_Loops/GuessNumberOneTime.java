package CH_05_Loops;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess (0-100): ");
        int guess = input.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.print("Your guess was too high! Please guess again: ");
                guess = input.nextInt();
            }
            else {
                System.out.print("Your guess was too low! Please guess again: ");
                guess = input.nextInt();
            }
        }
        System.out.println("You guessed correctly!");
    }
}
