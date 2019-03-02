


	import java.util.Scanner;



	class FixedAccount{
		public void calculateInterest(double p, int t)
		{
			float r =  0.5f;
			float interest = (float) ((p*t*r)/100);
			System.out.print("Fixed Account interest: "+interest);
		}
	}

	class SavingsAccount extends FixedAccount{
//		SavingsAccount()
//		{
//			super();
//		}
		public void calculateInterest(double p, int t)
		{
			float r = 0.3f;
			float interest = (float) ((p*t*r)/100);
			System.out.print("Savings Account interest: "+interest);
		}
	}
	public class DriverClass {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principal amount");
			double amt = sc.nextDouble();
			System.out.println("Enter the time period");
			int year = sc.nextInt();
			SavingsAccount sa = new SavingsAccount();
			sa.calculateInterest(amt,year);
		}
	}
