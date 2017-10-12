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
	@Test
	public void testNegativesNumbers(){
		try{
		calculator.add("-1,2");
		}
		catch (RuntimeException ex){
		assertEquals("Negatives not allowed: -1", ex.getMessage());
		}
	}
	@Test
	public void testMoreNegativesNumbers(){
		try{
		calculator.add("2,-4,3,-5");
		}
		catch (RuntimeException ex){
		assertEquals("Negatives not allowed: -4,-5", ex.getMessage());
		}
	}
	@Test
	public void testValuesBiggerThenOneThousand(){
		assertEquals(2, calculator.add("1001,2"));
	}
	@Test
	public void testUpgradedDelimiter(){
		assertEquals(3, calculator.add("//;\n1;2"));
	}
}