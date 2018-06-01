package ExInterger01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Multiplique03Test {

	@Test
	public void multipliqueTest() {
		Multiplique03 mult = new Multiplique03();
		assertTrue(15 == mult.multiplique(5, 3));
	}
}
