import static org.junit.Assert.*;
import org.junit.Test;
public class CalcJUnitTest 
{
	@Test
	public final void CalcTest()
	{
		CalcJUnitTest tester = new CalcJUnitTest();
		double futureValue = 11022.66;
		assertEquals("Should be: ", futureValue, CalcFutureValue.FutureValue(10000, 3, 3.25 / 100), 2);
	}

}
