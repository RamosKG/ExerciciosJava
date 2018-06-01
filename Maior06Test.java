package ExInterger01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Maior06Test {

	@Test
	public void maior() {
		Maior06 maior = new Maior06();
		assertEquals("O primeiro valor digitado é maior", maior.maior(5, 2));
		assertEquals("O segundo valor digitado é maior", maior.maior(2, 5));
	}
}
