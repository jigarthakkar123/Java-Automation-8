package jUnitTesting;

import org.junit.Ignore;
import org.junit.Test;

public class Test2 {

	@Test(expected = ArithmeticException.class)
	public void test2()
	{
		System.out.println(10/5);
	}
}
