package Ch_02_Elementary_Programming;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Enter the annual interest rate
        System.out.print("Enter the annual interest rate e.g. 5.25%: ");
        double annualInterestRate = input.nextDouble();

        // Get Monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Enter number of years for the loan
        System.out.print("Enter number of years of the loan: ");
        int numberOfYears = input.nextInt();

        // Enter the loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        // Calculate Payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display the results
        System.out.println("The monthly payment is $" + monthlyPayment + (int)(monthlyPayment * 100) / 100.0);

        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
    }
}
