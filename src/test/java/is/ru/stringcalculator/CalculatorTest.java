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

	@Test
	public void testThreeNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testThreeNumbersV2(){
		assertEquals(12, Calculator.add("6,4,2"));
	}

	@Test
	public void testNewLine(){
		assertEquals(8, Calculator.add("4\n4"));
	}

	@Test
	public void testNewLineAndComma(){
		assertEquals(12, Calculator.add("6\n4,2"));
	}
}