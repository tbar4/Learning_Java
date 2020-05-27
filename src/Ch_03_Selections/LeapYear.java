package Ch_03_Selections;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Leap year calculation
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Output
        if (isLeapYear == true)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is NOT a leap year");
    }
}
