import java.util.Scanner;

public class CompoundMonthlyInterest {
/*The purpose of the program is to calculate the compound monthly interest by taking various inputs from the user
  Name=Umut   Surname=Bayar   Number=150120043*/
	public static void main(String[] args) {
		double initial_Principal_Amount;
		double annual_Interest_Rate;
		double numberofTimePeriodsinMonths;
		double monthly_interest_rate;
		double total_compound_interest_amount;
		double finall_balance_amount;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter initial principal amount: ");
		initial_Principal_Amount=scan.nextDouble();
		System.out.println("Enter annual interest rate (e.g. 9.45): ");
		annual_Interest_Rate=scan.nextDouble();
		System.out.println("Enter number of time periods in months: ");
		numberofTimePeriodsinMonths=scan.nextDouble();
		finall_balance_amount=initial_Principal_Amount*(Math.pow(((1+(annual_Interest_Rate)/1200)),numberofTimePeriodsinMonths));
		total_compound_interest_amount=finall_balance_amount-initial_Principal_Amount;
		monthly_interest_rate=annual_Interest_Rate/12;
			System.out.println();
			System.out.println("Initial principal amount: "+initial_Principal_Amount);
			System.out.println("Monthly interest rate: "+(int)(monthly_interest_rate*100)/100.0);
			System.out.println("Total compound interest amount: "+(int)(total_compound_interest_amount*100)/100.0);
			System.out.println("Final balance amount: "+(int)(finall_balance_amount*100)/100.0);
	}		
}
