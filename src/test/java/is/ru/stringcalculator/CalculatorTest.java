package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(5, Calculator.add("5"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(8, Calculator.add("3,5"));
	}
}