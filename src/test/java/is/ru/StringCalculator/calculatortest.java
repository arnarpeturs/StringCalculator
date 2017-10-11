package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatortest	
{
	@Test
	public void testEmptyString() {
		assertEquals(0, calculator.add(""));
		assertEquals(2, calculator.add(""));
	}
}