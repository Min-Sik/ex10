package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void testSum() {
		assertEquals(Calc.sum(2, 2), 4);
		assertEquals(Calc.sum(3, 5), 8);
		assertEquals(Calc.sum(7, 2), 9);
	}

}
