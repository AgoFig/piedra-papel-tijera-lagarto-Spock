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
			
			if(this.forma == forma.PIEDRA && otra.forma == forma.TIJERA || otra.forma == forma.LAGARTO){
				resultado = Resultado.GANA;
			}
			else{
				if(this.forma == forma.PAPEL && otra.forma == forma.PIEDRA || otra.forma == forma.SPOCK){
					resultado = Resultado.GANA;
				}
				else{
					if(this.forma == forma.TIJERA && otra.forma == forma.LAGARTO || otra.forma == forma.PAPEL){
						resultado = Resultado.GANA;
					}
					else{
						if(this.forma == forma.LAGARTO && otra.forma == forma.SPOCK || otra.forma == forma.PAPEL){
							resultado = Resultado.GANA;
						}
						else{
							if(this.forma == forma.SPOCK && otra.forma == forma.PIEDRA || otra.forma == forma.TIJERA){
								resultado = Resultado.GANA;
							}
							else{
								
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
