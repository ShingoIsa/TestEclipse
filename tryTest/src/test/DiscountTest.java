package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jtech.Discount;

class DiscountTest {

	@Test
	void testPriceCheck() {
		Discount dc = new Discount();
		assertTrue(dc.priceCheck(50000));
		assertFalse(dc.priceCheck(10000));
	}
	
	@Test
	void testSexCheck() {
		Discount dc = new Discount();
		assertEquals(0.2, dc.sexCheck("f"), 0.0);
		assertEquals(0.1, dc.sexCheck("m"), 0.0);
	}
	
	@Test
	void testAgeCheck() {
		Discount dc = new Discount();
		assertEquals(5000, dc.ageCheck(18));
		assertEquals(1000, dc.ageCheck(20));
	}

}
