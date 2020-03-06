// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Laborator_ISP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/************************************************************/
/**
 * 
 */
public class Automobil extends Vechicul {

	public Automobil(Combustibil combustibil, tTransmisie cutie) {
		this.combustibil = combustibil;
		this.cutieViteze = cutie;
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
		File logFile = new File(numeFisier);
		PrintWriter filePrint;
		 
		
		
		try {
			logFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		FileWriter testWriter;
		try {
			testWriter = new FileWriter(logFile);
			filePrint = new PrintWriter(testWriter, true);
			filePrint.println("Viteza maxima: " + this.vitezaMaxima);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
