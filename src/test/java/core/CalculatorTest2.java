package core;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)			// executes tests in lexicographical order		

public class CalculatorTest2 {

	@Test(timeout = 1000) // @Ignore					// always use timeout with @Test - waits up to 1sec before the test fails
	public void test_01_add_2_params() {
		System.out.println("Test # 01: Add 2 params");

		assertEquals("Sum of two numbers is not correct", Calculator.add(200.0, 150.0), 350.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_02_add_3_params() {
		System.out.println("Test # 02: Add 3 params");

		assertEquals("Sum of three numbers is not correct", Calculator.add(8.0, 5.0, 7.0), 20.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_03_add_4_params() {
		System.out.println("Test # 03: Add 4 params");

		assertEquals("Sum of four numbers is not correct", Calculator.add(185.3, 0.7, 10.0, 74.0), 270.0, 0.09);
	}
	
	@Test(timeout = 1000) // @Ignore
	public void test_04_divide_2_params() {
		System.out.println("Test # 04: Divide 2 params");

		assertEquals("Division of two numbers is not correct", Calculator.divide(90.0, 30.0), 3.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_05_divide_3_params() {
		System.out.println("Test # 05: Divide 3 params");

		assertEquals("Division of three numbers is not correct", Calculator.divide(40.0, 8.0, 2.0), 2.5, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_06_divide_4_params() {
		System.out.println("Test # 06: Divide 4 params");

		assertEquals("Division of four numbers is not correct", Calculator.divide(600.0, 50.0, 4.0, 2.0), 1.5, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_07_multiply_2_params() {
		System.out.println("Test # 07: Multiply 2 params");

		assertEquals("Multiplication of two numbers is not correct", Calculator.multiply(9.0, 5.0), 45.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore		
	public void test_08_multiply_3_params() {
		System.out.println("Test # 08: Multiply 3 params");

		assertEquals("Multiplication of three numbers is not correct", Calculator.multiply(20.0, 5.0, 8.0), 800.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_09_multiply_4_params() {
		System.out.println("Test # 09: Multiply 4 params");

		assertEquals("Multiplication of four numbers is not correct", Calculator.multiply(24.0, 4.0, 10.0, 5.0), 4800.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_10_subtract_2_params() {
		System.out.println("Test # 10: Subtract 2 params");

		assertEquals("Subtruction of two numbers is not correct", Calculator.subtract(28.0, 14.0), 14.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_11_subtract_3_params() {
		System.out.println("Test # 11: Subtract 3 params");

		assertEquals("Subtruction of three numbers is not correct", Calculator.subtract(220.0, 20.0, 120.0), 80.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_12_subtract_4_params() {
		System.out.println("Test # 12: Subtract 4 params");

		assertEquals("Subtruction of four numbers is not correct", Calculator.subtract(400.0, 150.0, 50.0, 45.0), 155.0, 0.09);
	}
	
	@Test(timeout = 1000) // @Ignore
	public void test_13_max_2_params() {
		System.out.println("Test # 13: Max      2 params");

		assertEquals("The max number is not correct", Math.max(23.12, 23.0), 23.12, 0.09);
		 
	}
	
	@Test(timeout = 1000) // @Ignore
	public void test_14_avg_2_params() {
		System.out.println("Test # 14: Average  2 params");

		assertEquals("The average of two numbers is incorrect", Calculator.avg(1.0, 2.0), 1.5, 0.09);
		 
	}
	
	@Test(timeout = 1000) // @Ignore
	public void test_15_avg_3_params() {
		System.out.println("Test # 15: Average  3 params");

		assertEquals("The average of three numbers is incorrect", Calculator.avg(1.0, 2.0, 3.0), 2.0, 0.09);
		 
	}
	
	@Test(timeout = 1000) // @Ignore
	public void test_16_avg_4_params() {
		System.out.println("Test # 16: Average  4 params");

		assertEquals("The average of four numbers is incorrect", Calculator.avg(1.0, 2.0, 3.0, 6.0), 3.0, 0.09);
		 
	}
	
}