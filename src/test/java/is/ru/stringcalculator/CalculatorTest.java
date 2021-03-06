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

	@Test
	public void testNegativeNumber(){
		try{
			Calculator.add("-1,2");
		}catch (IllegalArgumentException e){
			assertEquals("Negatives are not allowed: [-1]", e.getMessage());
		}
	}

	@Test
	public void testManyNegativeNumbers(){
		try{
			Calculator.add("-1,2,-5,6,-2");
		}catch (IllegalArgumentException e){
			assertEquals("Negatives are not allowed: [-1, -5, -2]", e.getMessage());
		}
	}

	@Test
	public void testBiggerthen1000(){
		assertEquals(5, Calculator.add("10000,2,3"));
	}

	@Test
	public void testBiggerthen1000V2(){
		assertEquals(1006, Calculator.add("9999,1000,3\n3"));
	}

	@Test
	public void testDelimiter(){
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testDelimiterV2(){
		assertEquals(10, Calculator.add("//Hello\n1Hello2Hello3Hello4"));
	}		
}