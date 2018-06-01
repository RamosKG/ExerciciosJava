package ExInterger01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SomaTest {

	int Valor01 = 1;
	int Valor02 = 2;

	@Test
	public void SomaTest(){
		Soma soma = new Soma();
		assertTrue(7 == soma.soma (5,2));
	}
}