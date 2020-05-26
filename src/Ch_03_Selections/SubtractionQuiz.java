package Ch_03_Selections;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // Generate random numbers using `Math.random()`
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Swamp number 1 and number 2 if 1 is less than 2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        // Get user input
        int answer = input.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is incorrect");
            System.out.println(number1 + " - " + number2 + " is " + (number1 - number2));
        }
    }
}
