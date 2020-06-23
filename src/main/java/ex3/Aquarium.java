package ex3;

/**
 * Classe qui conceptualise la zone aquarium d'un zoo
 * 
 * @author antoinelabeeuw
 *
 */
public class Aquarium extends ZoneATheme {

	/**
	 * Constructeur
	 * 
	 */
	public Aquarium() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 0.2;
	}
}
