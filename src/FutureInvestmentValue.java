import java.util.Scanner;

public class FutureInvestmentValue
{
    public static void main(String args[])
    {
        System.out.println("Type in the \"Investment rate\", \"Annual Interest rate\", and \"Number of years\"" +
                " to calculate the future Investment Value:");
        Scanner UserInput = new Scanner(System.in);
        double InvestmentRate = UserInput.nextDouble();
        float AnnualInterestRate = UserInput.nextFloat()/100;
        int NumberOfYears = UserInput.nextInt();
        double MonthlyInterestRate = AnnualInterestRate/12;
        double FutureInvestmentRate = InvestmentRate*Math.pow((1+MonthlyInterestRate),(NumberOfYears*12));
        System.out.println("Your future Investment Is:" + FutureInvestmentRate);
    }
}
