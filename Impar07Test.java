package ExInterger01;

import static org.junit.Assert.*;


import org.junit.Test;

public class Impar07Test {

	@Test
	public void Impar07() {
	Impar07 mostreimpar = new Impar07();
		assertTrue (Impar07.eimpar(85));
		assertFalse (Impar07.eimpar(10));
	}

}
