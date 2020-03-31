package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Task3.Calculator;

@RunWith(Parameterized.class)
public class TestCalculator3 extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public TestCalculator3(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:multOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 2, 2 }, { 2, 6, 12 }, { 18, 2, 36 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getMultiple(valueA, valueB));
	}
}