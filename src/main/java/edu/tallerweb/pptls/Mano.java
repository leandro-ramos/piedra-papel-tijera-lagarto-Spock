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
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Integer mano1 = this.forma.getValor();
		Integer mano2 = otra.forma.getValor();
		if (mano1 == mano2) {
			return Resultado.EMPATA; }
		else {
			if (mano1 == (mano2 + 1) % 5 || mano1 == (mano2 + 2) % 5) {
				return Resultado.GANA; }
			else {
				return Resultado.PIERDE; }
		}
	}
}
