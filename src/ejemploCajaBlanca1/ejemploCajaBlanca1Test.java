package ejemploCajaBlanca1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ejemploCajaBlanca1Test {

	@Test
	void CP1() {
		String cadenaEsperada="El número -2 no es un número perfecto";
		String cadenaObtenida=EjemploCajaBlanca1.CompruebaNumeroPerfecto(-2);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}
	@Test
	void CP3() {
		String cadenaEsperada="El número 28 es un número perfecto";
		String cadenaObtenida=EjemploCajaBlanca1.CompruebaNumeroPerfecto(28);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}
	@Test
	void CP4() {
		String cadenaEsperada="El número 8 no es un número perfecto";
		String cadenaObtenida=EjemploCajaBlanca1.CompruebaNumeroPerfecto(8);
		assertEquals(cadenaEsperada, cadenaObtenida);
	}
}
