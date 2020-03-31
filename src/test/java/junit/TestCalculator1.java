package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Task3.Calculator;

@RunWith(Parameterized.class)
public class TestCalculator1 extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public TestCalculator1(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 2 }, { 2, 6, 8 }, { 18, 2, 20 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getSum(valueA, valueB));
	}
}
