package ex3;

/**
 * Classe qui conceptualise une ferme a reptile d'un zoo
 * 
 * @author antoinelabeeuw
 *
 */
public class FermeReptile extends ZoneATheme {

	/**
	 * Constructeur
	 * 
	 */
	public FermeReptile() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 10;
	}

}
