package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		Mano jugadorTres = new Mano(Forma.TIJERA);
		Mano jugadorCuatro = new Mano(Forma.LAGARTO);

		assertEquals("Spock vaporiza piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
		assertEquals("Piedra empata contra piedra", Resultado.EMPATA,
				jugadorDos.jugarCon(jugadorDos));
		assertEquals("Tijera corta lagarto", Resultado.GANA,
				jugadorTres.jugarCon(jugadorCuatro));
		assertEquals("Lagarto es cortado por tijera", Resultado.PIERDE,
				jugadorCuatro.jugarCon(jugadorTres));
	}

}
