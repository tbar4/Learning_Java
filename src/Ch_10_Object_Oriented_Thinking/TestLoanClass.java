package Ch_10_Object_Oriented_Thinking;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter an annual interest rate
        System.out.print("Enter the annual interest rate, for example 4.99: ");
        double annualInterestRate = input.nextDouble();

        // Enter the number of years
        System.out.print("Enter years for the loan: ");
        int numberOfYears = input.nextInt();

        // Enter the loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        // Create a loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display the loan data
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}

class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private double NumberOfMonths;
    private java.util.Date loanDate;

    private double numberOfMonths = numberOfYears * 12.0;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.numberOfMonths = numberOfYears * 12.0;
        loanDate = new java.util.Date();
    }

    public java.util.Date getLoanDate() {return loanDate;}

    public Double getMonthlyPayment() {
        double monthlyRate = annualInterestRate / 100.0 / 12.0;
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - (Math.pow(1 + monthlyRate, -numberOfMonths)));

        return monthlyPayment;
    }

    public Double getTotalPayment() {
        double payments = getMonthlyPayment();
        double totalPayment = payments * numberOfMonths;

        return totalPayment;
    }

}
