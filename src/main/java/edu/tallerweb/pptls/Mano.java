package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma forma;
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
		//throw new RuntimeException("No implementado aún");
	}

	/**
	 * Evaluara el resultado de la partida segun las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {
		
		Resultado resultado = Resultado.EMPATA;
		if(this.forma == otra.forma){
			resultado = Resultado.EMPATA;
		}
		else{
			
			if(this.forma == Forma.PIEDRA && otra.forma == Forma.TIJERA || otra.forma == Forma.LAGARTO){
				resultado = Resultado.GANA;
			}
			else{
				if(this.forma == Forma.PAPEL && otra.forma == Forma.PIEDRA || otra.forma == Forma.SPOCK){
					resultado = Resultado.GANA;
				}
				else{
					if(this.forma == Forma.TIJERA && otra.forma == Forma.LAGARTO || otra.forma == Forma.PAPEL){
						resultado = Resultado.GANA;
					}
					else{
						if(this.forma == Forma.LAGARTO && otra.forma == Forma.SPOCK || otra.forma == Forma.PAPEL){
							resultado = Resultado.GANA;
						}
						else{
							if(this.forma == Forma.SPOCK && otra.forma == Forma.PIEDRA || otra.forma == Forma.TIJERA){
								resultado = Resultado.GANA;
							}
						}	
					}
				}
			}
			
		}
		
		return resultado;
		/*throw new RuntimeException("No implementado aun");*/
	}

}
