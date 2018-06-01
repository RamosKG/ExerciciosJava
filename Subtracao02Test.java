package ExInterger01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Subtracao02Test {

	@Test
	public void SubtracaoTest() {
		Subtracao02 sub = new Subtracao02();
		assertTrue(2 == sub.subtracao(4, 2));
	}
}
