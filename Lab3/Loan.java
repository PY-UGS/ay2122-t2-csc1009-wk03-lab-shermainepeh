package Lab3;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    Date today = new Date();

    public Loan() { // Default
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = today;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        loanDate = today;
        return loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = (getAnnualInterestRate() / 100) / 12;
        // double monthlyPayment = (getLoanAmount() * monthlyInterestRate / (1 / (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))));
        double monthlyPayment =  (getLoanAmount() * monthlyInterestRate / (1 - (1 / (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))))));
        //String.format("%.2f", monthlyPayment);
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * getNumberOfYears() * 12;
        return totalPayment;
    }
}