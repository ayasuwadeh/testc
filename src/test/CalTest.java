package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

class CalculatorTest {
private static Calculator temp;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		temp=new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_positive_positive_positive() {
		int a=4;
		int b=8;
		int result=temp.sum(a, b);
		
		assertTrue(result==12);
	}
	
	@Test
	void test_positive_negative_negative() {
		int a=-4;
		int b=8;
		int result=temp.sum(a, b);
		
		assertTrue(result==4);
	}
	
	@Test
	void test_positive_negative_positive() {
		int a=4;
		int b=-8;
		int result=temp.sum(a, b);
		
		assertTrue(result==-4);
	}
	
	@Test
	void test_negative_negative_negative() {
		int a=-4;
		int b=-8;
		int result=temp.sum(a, b);
		
		assertTrue(result==-12);
	}
	
	@Test
	void test_equals() {
		int a=-4;
		int b=4;
		int result=temp.sum(a, b);
		
		assertTrue(result==0);
	}
}
