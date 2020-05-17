package maths;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sb.maths.Calculator;

public class Calculator_Test {
 

	@Test
	public void shouldCheckAddition() {
		Calculator cal = new Calculator();
		assertEquals(6, cal.add(3, 3));
	}

	@Test
	public void shouldCheckSub() {
		Calculator cal = new Calculator();
		assertEquals(0, cal.sub(3, 3));
	}
}
