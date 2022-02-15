package Lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab3_Main {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = checkInputForDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = checkInputForInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = checkInputForDouble();

        Loan loan1 = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.println("The loan was created on " + loan1.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", loan1.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", loan1.getTotalPayment()));
    }
    public static double checkInputForDouble() {
        while(true)
        {
            try {
                return userInput.nextDouble();
            } catch (InputMismatchException ex) {
                userInput.next();
                System.out.println("Not a valid number!");
                System.out.println("Please re-enter: ");
            }
        }
    }

    public static int checkInputForInt() {
        while(true)
        {
            try {
                return userInput.nextInt();
            } catch (InputMismatchException ex) {
                userInput.next();
                System.out.println("Not a valid number!");
                System.out.println("Please re-enter: ");
            }
        }
    }
}