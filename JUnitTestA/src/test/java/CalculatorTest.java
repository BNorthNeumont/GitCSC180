import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	void testAdd() {
		if (Calculator.add(1, 5) != 6) {
			fail("Not yet implemented");
		}
	}
	@Test
	void testSubtraction() {
		if (Calculator.subtraction(7, 5) != 2) {
				fail("Not yet implemented");
			}
	}
	@Test
	void testDivision() {
		if (Calculator.division(15, 3) != 5) {
			fail("Not yet implemented");
		}
	}
	@Test
	void testMultiply() {
		if (Calculator.multiply(5, 5) != 25) {
			fail("Not yet implemented");
		}
	}

/*	@Test
	void testSubtraction() {
		//Calculator clsCalc = new Calculator();
		assertEquals(Calculator.subtraction(7, 5),2);
		assertNull();
		assertNotNull();
		assertTrue();
		assertFalse();
		assertSame();
		assertNotSame();
		//if (Calculator.subtraction(7, 5) != 2) {
		//	fail("Not yet implemented");
		//}
	}*/
}
