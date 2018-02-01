import static org.junit.Assert.*;

import org.junit.Test;

public class caltest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(50,30),50);
	}
	
	@Test
	public void testMinus() {
		Calculator cal = new Calculator();
		assertEquals(cal.minus(50,20),20);
	
	}
	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(70,70),200);
	}

}
