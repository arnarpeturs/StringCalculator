package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatortest	
{
	@Test
	public void testEmptyString() {
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
	public void testThreeNumbers() {
		assertEquals(6, calculator.add("1,2,3"));
	}
	@Test
	public void testNewLineCharacter() {
		assertEquals(6, calculator.add("1\n2,3"));
	}
	@Test(expected = Exception.class) 
	public void testNegativeNumbers() {
		assertEquals()
	}

}