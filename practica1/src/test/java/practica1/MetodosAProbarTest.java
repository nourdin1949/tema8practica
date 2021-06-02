package practica1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetodosAProbarTest {

	@Test
	public void testAplicarIVA() {
		MetodosAProbar sc = new MetodosAProbar();
		int resultado = (int)sc.AplicarIVA(100);
		int esperado = 121;
		assertEquals( resultado,esperado);
	}

	@Test
	public void testValidar() {
		MetodosAProbar sc = new MetodosAProbar();
		String DNI = sc.validar(36683453);
		String supuesto = "36683453V";
		assertEquals(supuesto, DNI);
	}

}
