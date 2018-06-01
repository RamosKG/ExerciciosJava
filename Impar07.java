package ExInterger01;

public class Impar07 {

	public void mostreimpar() {

		for (Integer contador = 0; contador <= 100; contador++) {
			if (eimpar(contador)) {
				System.out.println(contador);
			}
		}
	}

	public static  boolean eimpar(int valor) {

		int num = valor;

		if (num % 2 != 0) {
			return true;
		}
		return false;
	}
}

