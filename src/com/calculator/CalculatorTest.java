package com.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(30, calculator.sum(10, 20));
	}
	
	@Test
	public void testOther() {
		
		File file = new File("a");
		
		assertTrue(file.exists());
	}

}
