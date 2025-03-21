import java.time.LocalTime;
import java.util.Scanner;

public class Loan {
    double loanAmount;
    int numberOfYears;
    double annualInterestRate;
    LocalTime loanDate;

    Loan() {
        loanAmount = 1000;
        annualInterestRate = 2.5;
        numberOfYears = 1;
    }

    Loan(double LoanAmount, int NumberOfYears, double AnnualInterestRate) {
        loanAmount = LoanAmount;
        numberOfYears = NumberOfYears;
        annualInterestRate = AnnualInterestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public static double monthlyPayment(double annualInterestRate, int numOfYears, double loanAmount) {
        double monthlyInterestRate = annualInterestRate / 1200;
        return (monthlyInterestRate + monthlyInterestRate / (Math.pow((1 + monthlyInterestRate), numOfYears * 12) - 1)) * loanAmount;
    }

    public static double totalPayment(double annualInterestRate, int numOfYears, double loanAmount) {
        double totalInterestRate = 1;
        for (int i = 1; i <= numOfYears; i++) {
            totalInterestRate += totalInterestRate * annualInterestRate/100;
        }
        return totalInterestRate * loanAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loan loan = new Loan();
        loan.loanDate = java.time.LocalTime.now();
        System.out.println("Nhập vào khoản tiền cho vay: ");
        loan.loanAmount = sc.nextDouble();
        System.out.println("Nhập vào số năm cho vay: ");
        loan.numberOfYears = sc.nextInt();
        System.out.println("Nhập vào tỉ lệ lãi suất cho vay hằng năm: ");
        loan.annualInterestRate = sc.nextDouble();

        System.out.println("Ngày giờ bắt đầu vay: " + loan.loanDate);
        System.out.println("Số tiền phải trả hàng tháng: " + monthlyPayment(loan.annualInterestRate, loan.numberOfYears, loan.loanAmount));
        System.out.println("Tổng số tiền phải trả: " + totalPayment(loan.annualInterestRate, loan.numberOfYears, loan.loanAmount));

    }
}

