package com.parameter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmeticTest {

	int fNumber,sNumber,result;
	Arithmetic arithmetic;
		
	public ArithmeticTest(int fNumber, int sNumber, int result) {
		this.fNumber = fNumber;
		this.sNumber = sNumber;
		this.result = result;
	}
	@Before
	public void before()
	{
		arithmetic=new Arithmetic();
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{1,2,5},{11,22,33},{12,34,46}});
	}
	@Test
	public void test()
	{
		System.out.println("Result : "+result);
		assertEquals(result, arithmetic.sum(fNumber, sNumber));
	}
}
