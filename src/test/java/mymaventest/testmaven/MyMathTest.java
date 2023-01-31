package mymaventest.testmaven;

import org.junit.Test;

public class MyMathTest {
	@Test(expected = ArithmeticException.class)
	public void zeroDenominatorShoudThrowExecption() {
		MyMath.divide(1, 0);
	}
}
