// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Laborator_ISP;

/************************************************************/
/**
 * 
 */
public class Automobil extends Vechicul {
	
	public Automobil(Combustibil combustibil, tTransmisie cutie) {
		this.combustibil=combustibil;
		this.cutieViteze=cutie;
	}
	/**
	 * 
	 */
	private Combustibil combustibil;
	/**
	 * 
	 */
	private tTransmisie cutieViteze;

	/**
	 * 
	 */
	public void afisare() {
		super.afisare();
		System.out.println("Afisare auto");
	}

	/**
	 * 
	 * @param numeFisier 
	 */
	public void salvare(String numeFisier) {
	}
};