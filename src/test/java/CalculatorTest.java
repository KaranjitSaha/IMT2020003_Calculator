// package calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	@Test
	    public void test_add() {
	        int a = 25;
	        int b =5;
            int expectedResult = 30;
	        int result = Main.add(a,b);
	        Assert.assertEquals(expectedResult, result);
	    }
	
	@Test
	    public void test_subtract() {
	        int a = 5;
            int b= 2;
	        int expectedResult = 3;
	        int result = Main.subtract(a,b);
	        Assert.assertEquals(expectedResult, result);
	    }
		
	@Test
	    public void test_multiply() {
	        int a = 2;
            int b=1;
	        int expectedResult = 2;
	        int result = Main.multiply(a,b);
	        Assert.assertEquals(expectedResult, result);
	    }
	
	@Test
	    public void test_power() {
	        int a = 10;
			int b = 5;
	        int expectedResult = 2;
	        int result = Main.division(a,b);
	        Assert.assertEquals(expectedResult, result);
	    }
	
}
