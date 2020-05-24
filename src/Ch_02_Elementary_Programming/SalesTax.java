package Ch_02_Elementary_Programming;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sale amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * .1;
        System.out.println("Sales Tax $" + (int)(tax * 100) / 100.0);
    }
}
