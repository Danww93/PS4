
public class CalcFutureValue 
{
	public static double FutureValue(double amount, int years, double rate)
	{
	
		for(int x = 0; x < (12 * years); x++)
		{
			double interest = 0;
			interest = (rate / 12) * amount;
			amount = amount + interest;
			amount = Math.round(amount * 100);
			amount = amount / 100;
		}
		return amount;
	}

}
