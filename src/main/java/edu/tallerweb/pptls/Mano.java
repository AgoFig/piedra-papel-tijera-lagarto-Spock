package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma forma;

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condici�n en el juego.
	 * 
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
		// throw new RuntimeException("No implementado aún");
	}

	/**
	 * Evaluara el resultado de la partida segun las reglas del juego.
	 * 
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {
		Resultado resultado = Resultado.EMPATA;

		switch (this.forma) {
		case PIEDRA:
			if (otra.forma == Forma.TIJERA || otra.forma == Forma.LAGARTO) {
				resultado = Resultado.GANA;
			} else {
				resultado = Resultado.PIERDE;
			}
			break;
		case PAPEL:
			if (otra.forma == Forma.PIEDRA || otra.forma == Forma.SPOCK) {
				resultado = Resultado.GANA;
			} else {
				resultado = Resultado.PIERDE;
			}
			break;
		case TIJERA:
			if (otra.forma == Forma.LAGARTO || otra.forma == Forma.PAPEL) {
				resultado = Resultado.GANA;
			} else {
				resultado = Resultado.PIERDE;
			}
			break;
		case LAGARTO:
			if (otra.forma == Forma.SPOCK || otra.forma == Forma.PAPEL) {
				resultado = Resultado.GANA;
			} else {
				resultado = Resultado.PIERDE;
			}
			break;
		case SPOCK:
			if (otra.forma == Forma.PIEDRA || otra.forma == Forma.TIJERA) {
				resultado = Resultado.GANA;
			} else {
				resultado = Resultado.PIERDE;
			}
			break;
		}
		if (this.forma == otra.forma) {
			resultado = Resultado.EMPATA;
		}
		return resultado;
		/* throw new RuntimeException("No implementado aun"); */
	}

}
