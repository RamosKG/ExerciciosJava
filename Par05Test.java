package ExInterger01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Par05Test {

	@Test
	public void Par05() {
		Par05 num = new Par05();
		assertEquals("É par", num.par(2));
		assertEquals("É ímpar", num.par(3));
	}

}
