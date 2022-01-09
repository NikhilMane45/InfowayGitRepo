package com.test;

import org.junit.jupiter.api.Test;

import com.app.Main;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
	
	@Test
	public void testInputisEven () {
		assertTrue(Main.checkIfInputIsAnEvenNumber(22));//Assertion
	}
}
