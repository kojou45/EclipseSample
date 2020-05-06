package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticSampleTest {

	@Test
	public void testSum() {
//		fail("まだ実装されていません");
		ArithmeticSample amz = new ArithmeticSample();
		assertEquals(1, amz.sum(1,0));
	}

	@Test
	public void testSub() {
//		fail("まだ実装されていません");
		ArithmeticSample amz = new ArithmeticSample();
		assertEquals(1, amz.sub(1,0));
	}

}
