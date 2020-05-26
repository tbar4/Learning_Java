package Ch_03_Selections;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        /* Generate random numbers using (int) on the remainder
           of the current system time
         */
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int answer = number1 + number2;
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Prompt user for answer
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        // return the user input to the variable input
        int number = input.nextInt();

        System.out.print(number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == number));
    }
}
