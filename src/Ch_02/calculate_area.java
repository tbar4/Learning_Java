package Ch_02;

import java.util.Scanner;

public class calculate_area {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of a radius " + radius + " is " + area);
    }
}

