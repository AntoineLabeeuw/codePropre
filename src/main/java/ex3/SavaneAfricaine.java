package ex3;

/**
 * Classe qui conceptualise la savane africaine d'un zoo
 * 
 * @author antoinelabeeuw
 *
 */
public class SavaneAfricaine extends ZoneATheme {

	/**
	 * Constructeur
	 * 
	 */
	public SavaneAfricaine() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size();
	}

}
