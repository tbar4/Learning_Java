package Ch_03_Selections;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get Weight
        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();

        // Get Height
        System.out.print("Enter Height in Inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Convert height and weight to metric
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        // Calculate BMI - weight / height^2
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        // List where your bmi is on the chart
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
