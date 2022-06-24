package 面向对象;
import java.util.Scanner;

public class TestLoanClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    Scanner input = new Scanner(System.in);
   
    System.out.print(
    "Enter annual interest rate, for example, 8.25: ");
    double annualInterestRate = input.nextDouble();
    
    System.out.print(
    		"Enter a number of years as an integer: ");
    int numberOfYears = input.nextInt();
    
    System.out.print(
    		"Enter loan amount, for example, 12000.95: ");
    double loanAmount = input.reset().nextDouble();
    
    
    Loan loan=
    		new Loan(annualInterestRate,numberOfYears,loanAmount);
    
    System.out.printf("The loan was careated in %s\n" + "The monthly payment "
    		+ "is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(),
    		loan.getMonthlyPayment(),loan.getTotalPayment());
	}

}
