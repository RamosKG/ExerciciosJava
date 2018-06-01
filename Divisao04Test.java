package ExInterger01;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class Divisao04Test {

	@Test
	public void dividaTest() {
	Divisao04 div = new Divisao04();
	assertTrue(2 == div.divida (10,5));
	}

}
